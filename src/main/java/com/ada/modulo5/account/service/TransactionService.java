package com.ada.modulo5.account.service;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ada.modulo5.account.Enum.StatusEnum;
import com.ada.modulo5.account.Enum.TypeEnum;
import com.ada.modulo5.account.model.Account;
import com.ada.modulo5.account.model.AccountBalance;
import com.ada.modulo5.account.model.Transaction;
import com.ada.modulo5.account.model.TransactionRequest;
import com.ada.modulo5.account.repository.AccountRepository;
import com.ada.modulo5.account.repository.TransactionRepository;

import jakarta.persistence.EntityNotFoundException;

@Service
public class TransactionService {
	
	@Autowired
	private AccountRepository accountRepository;
	
	@Autowired
	private TransactionRepository transactionRepository;

	public void transferir(TransactionRequest request) {
		
		Account contaOrigem = accountRepository.findByAccountIdentificationIdentifier(request.getIdContaOrigem())
			.orElseThrow(() -> new EntityNotFoundException("Conta não encontrada"));
		
		Account contaDestino = accountRepository.findByAccountIdentificationIdentifier(request.getIdContaDestino())
				.orElseThrow(() -> new EntityNotFoundException("Conta não encontrada"));
		
		Transaction transaction = new Transaction();
		transaction.setDate(LocalDate.now());
		transaction.setDescription("Transferência da Conta " +  contaOrigem.getAccountIdentification() + 
				" para a Conta" + contaDestino.getAccountIdentification());
		transaction.setName("Transferencia");
		transaction.setStatus(StatusEnum.INITIATED);
		transaction.setType(TypeEnum.ACCOUNTING_TRANSACTION);
		
		
        AccountBalance contaOrigemAccountBalance = contaOrigem.getAccountBalances().stream().findFirst().orElse(null);
        BigDecimal accountBalanceValue = contaOrigemAccountBalance.getBalance();
		BigDecimal newOrigemAccountBalance = accountBalanceValue.subtract(request.getValor());
		contaOrigemAccountBalance.setBalance(newOrigemAccountBalance);
		contaOrigem.setAccountBalances(Set.of(contaOrigemAccountBalance));
		
        accountRepository.save(contaOrigem);
        
        AccountBalance contaDestinoAccountBalance = contaDestino.getAccountBalances().stream().findFirst().orElse(null);
        BigDecimal destineAccountBalanceValue = contaDestinoAccountBalance.getBalance();
		BigDecimal newDestineAccountBalance = destineAccountBalanceValue.add(request.getValor());
		contaDestinoAccountBalance.setBalance(newDestineAccountBalance);
		contaOrigem.setAccountBalances(Set.of(contaDestinoAccountBalance));
		
        accountRepository.save(contaDestino);
        
		transaction.setStatus(StatusEnum.CONFIRMED);

        transactionRepository.save(transaction);

	}

}