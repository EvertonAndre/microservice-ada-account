package com.ada.modulo5.account.repository;

import com.ada.modulo5.account.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AccountRepository extends JpaRepository<Account, Long> {

    Optional<Account> findById(Long id);
    
    Optional<Account> findByAccountIdentificationIdentifier(String identifier );

    @Override
    void deleteById(Long id);
}
