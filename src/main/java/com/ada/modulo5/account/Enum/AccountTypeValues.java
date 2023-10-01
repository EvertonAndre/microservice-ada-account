package com.ada.modulo5.account.Enum;

import lombok.Getter;

@Getter
public enum AccountTypeValues {

    DEBIT_ACCOUNT ("Debit account"),
    CREDIT_ACCOUNT ("Crédito account"),
    VOSTRO_ACCOUNT ("Vostro account"),
    NOSTRO_ACCOUNT ("Nostro account"),
    PAYMENT_ACCOUNT ("Payment account"),
    SETTLEMENT_ACCOUNT ("Settlement account"),
    SAVING_ACCOUNT ("Saving account"),
    CURRENT_ACCOUNT ("Current account"),
    CASH_ACCOUNT ("Cash account");

    private String value;

    AccountTypeValues(String value){
        this.value = value;
    }
}
