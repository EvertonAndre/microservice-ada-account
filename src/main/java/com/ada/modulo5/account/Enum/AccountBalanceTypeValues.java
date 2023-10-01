package com.ada.modulo5.account.Enum;

import lombok.Getter;

@Getter
public enum AccountBalanceTypeValues {

    OPENING_BALANCE (""),
    CLOSING_BALANCE (""),
    CURRENT_BALANCE (""),
    AVAILABLE_BALANCE (""),
    LEDGER_BALANCE (""),
    RESERVE_BALANCE (""),
    FREE_BALANCE (""),
    PRINCIPAL_BALANCE ("");

    private String value;

    AccountBalanceTypeValues(String value){
        this.value = value;
    }
}
