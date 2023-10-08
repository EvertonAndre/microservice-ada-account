package com.ada.modulo5.account.controller;

import com.ada.modulo5.account.model.Account;
import com.ada.modulo5.account.service.AccountService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @PostMapping
    public ResponseEntity<Account> createAccount(@Valid @RequestBody Account account){
        accountService.saveAccount(account);
        return ResponseEntity.ok(account);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Account>> getAccount(@PathVariable Long id){
        Optional<Account> account = accountService.getAccount(id);
        if(account.isPresent()){
            return ResponseEntity.ok(account);
        }
        return ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deleteAccount(@PathVariable Long id){
        Optional<Account> account = accountService.getAccount(id);
        if(account.isPresent()){
            accountService.deleteAccount(id);
            return ResponseEntity.ok().build();
        }
        return ResponseEntity.notFound().build();
    }

    @PatchMapping("/{id}")
    public ResponseEntity updateAccount(@PathVariable Long id,@Valid @RequestBody Account account){
        Account p = accountService.updateAccount(id,account);
        return ResponseEntity.ok(p);
    }


}
