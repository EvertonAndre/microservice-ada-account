package com.ada.modulo5.account.model;

import jakarta.persistence.Entity;
import lombok.Data;

import java.time.LocalDate;

@Data
@Entity
public class AccountEntry {
//Essa classe tem ligacao com a Transaction do outro MS a ser criado

    private Double accountEntryAmount; //era pra ser do tipo amount, nao ecnontrei no diagrama
    private AccountCurrency accountEntryCurrency;
    private String accountEntryPurpose;
    private LocalDate accountEntryValueDate;
    private String accountEntryStatus;
}
