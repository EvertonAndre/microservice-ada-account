package com.ada.modulo5.account.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Data
@Entity
public class AccountEntry {
    @Id
    @GeneratedValue
    private Long id;
    private Double accountEntryAmount; //era pra ser do tipo amount, nao ecnontrei no diagrama
    @OneToOne
    @JoinColumn(name = "accountEntryCurrency")
    private AccountCurrency accountEntryCurrency;
    private String accountEntryPurpose;
    private LocalDate accountEntryValueDate;
    private String accountEntryStatus;
}
