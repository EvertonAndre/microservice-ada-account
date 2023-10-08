package com.ada.modulo5.account.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Account {

    @Id
    @GeneratedValue
    private Long id;

    @Column(columnDefinition = "AC_IDENTIFICATION")
    private AccountIdentification accountIdentification;

    @Column(columnDefinition = "AC_STATUS")
    private AccountStatus accountStatus;

    @Column(columnDefinition = "AC_DATE")
    private AccountDate accountDate;

    @Column(columnDefinition = "AC_TYPE")
    private AccountType accountType;

    @Column(columnDefinition = "AC_PURPOSE")
    private String accountPurpose;

    @Column(columnDefinition = "AC_BALANCE")
    private AccountBalance accountBalance;

    @Column(columnDefinition = "AC_CURRENCY")
    private AccountCurrency accountCurrency;

    @Column(columnDefinition = "AC_DESCRIPTION")
    private String accountDescription;
}
