package com.ada.modulo5.account.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

import java.time.LocalDate;

@Data
@Entity
public class AccountEntry {
    @Id
    @GeneratedValue
    private Long id;
    private Double accountEntryAmount; //era pra ser do tipo amount, nao ecnontrei no diagrama
    private AccountCurrency accountEntryCurrency;
    private String accountEntryPurpose;
    private LocalDate accountEntryValueDate;
    private String accountEntryStatus;
}
