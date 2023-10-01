package com.ada.modulo5.account.Enum;

import lombok.Getter;

@Getter
public enum AccountDateTypeValues {

    OPEENING_DATE ("Data de abertura"),
    CLOSING_DATE ("Data de fechamento"),
    BLOCKING_DATE ("Data de bloqueio");

    private String value;

    AccountDateTypeValues(String value){
        this.value = value;
    }

}
