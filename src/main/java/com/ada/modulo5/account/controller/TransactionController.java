package com.ada.modulo5.account.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ada.modulo5.account.model.TransactionRequest;
import com.ada.modulo5.account.service.TransactionService;

import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/transaction")
@Slf4j
public class TransactionController {
	
	@Autowired
	private TransactionService  transactionService;
	
    @PutMapping
    public ResponseEntity<Void> fazerTransferencia(@Valid @RequestBody TransactionRequest request){
        log.info("Fazendo transferencia com o request: {}", request);
        transactionService.transferir(request);
        return ResponseEntity.noContent().build();
    }
	

}
