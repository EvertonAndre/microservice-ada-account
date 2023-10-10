package com.ada.modulo5.account.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ada.modulo5.account.model.Transaction;

@Repository
public interface TransactionRepository extends JpaRepository<Transaction, Long>{

}