package com.ada.modulo5.account.Enum;

import lombok.Getter;

@Getter
public enum AccountCurrencyTypeValues {

    ACCOUNT_BASE_CURRENCY (""),
    ACCOUNT_REPORTING_CURRENCY (""),
    ACCOUNT_SECONDARY_CURRENCY ("");

    private String value;

    AccountCurrencyTypeValues(String value){
        this.value = value;
    }
}
