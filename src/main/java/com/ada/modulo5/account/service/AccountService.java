package com.ada.modulo5.account.service;

import com.ada.modulo5.account.model.Account;
import com.ada.modulo5.account.repository.AccountRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AccountService {


        @Autowired
        private AccountRepository accountRepository;

        public Account saveAccount(Account account){
            return accountRepository.save(account);
        }

        public Optional<Account> getAccount(Long id){
            return accountRepository.findById(id);
        }

        public void deleteAccount(Long id){
            accountRepository.deleteById(id);
        }

        public Account updateAccount(Long id, Account acc){
            Optional<Account> account = getAccount(id);
            if(account.isPresent()){
                account.get().setAccountIdentification(acc.getAccountIdentification());
                account.get().setAccountStatus(acc.getAccountStatus());
                account.get().setAccountDate(acc.getAccountDate());
                account.get().setAccountType(acc.getAccountType());
                account.get().setAccountPurpose(acc.getAccountPurpose());
                account.get().setAccountBalance(acc.getAccountBalance());
                account.get().setAccountCurrency(acc.getAccountCurrency());
                account.get().setAccountDescription(acc.getAccountDescription());
                return accountRepository.save(account.get());
            }else{
                throw new EntityNotFoundException();
            }
        }

    }
