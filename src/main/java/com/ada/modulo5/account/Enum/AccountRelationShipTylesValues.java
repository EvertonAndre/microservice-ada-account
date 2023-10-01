package com.ada.modulo5.account.Enum;

import lombok.Getter;

@Getter
public enum AccountRelationShipTylesValues {

    ACCOUNT_IS_PARENT_ACCOUNT_FOR_ACCOUNT (" "),
    ACCOUNT_IS_SUB_ACCOUNT_FOR_ACCOUNT ("Conta é uma sub conta de: "),
    ACCOUNT_IS_LINKED_TO_ACCOUNT ("Conta vinculada a conta: ");

    private String value;

    AccountRelationShipTylesValues(String value){
        this.value = value;
    }
}
