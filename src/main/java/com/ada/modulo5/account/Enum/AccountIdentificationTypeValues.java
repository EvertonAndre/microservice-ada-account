package com.ada.modulo5.account.Enum;

import lombok.Getter;

@Getter
public enum AccountIdentificationTypeValues {

    BBAN ("BBAN"),
    IBAN ("IBAN"),
    UPIC ("UPIC");

    private String value;

    AccountIdentificationTypeValues(String value){
        this.value = value;
    }

}
