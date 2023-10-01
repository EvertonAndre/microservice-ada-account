package com.ada.modulo5.account.Enum;

import lombok.Getter;

@Getter
public enum AccountDateTypeValues {

    OPEENINGDATE ("Data de abertura"),
    CLOSINGDATE ("Data de fechamento"),
    BLOCKINGDATE ("Data de bloqueio");

    private String value;

    AccountDateTypeValues(String value){
        this.value = value;
    }

}
