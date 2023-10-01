package com.ada.modulo5.account.Enum;

import lombok.Getter;

@Getter
public enum AccountStatusTypeValues {

    ENABLED ("Habilitado"),
    DISABLED ("Desabilitado"),
    DELETED ("Deletado"),
    PROFORMA ("Em Orçamento"),
    PENDING ("Em ánalise");

    private String value;

    AccountStatusTypeValues(String value){
        this.value = value;
    }
}
