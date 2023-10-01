package com.ada.modulo5.account.Enum;

import lombok.Getter;

@Getter
public enum AccountInvolvementTypeValues {

    PARTY_OWNER ("party owner"),
    PARTY_SERVICE ("party service");

    private String value;

    AccountInvolvementTypeValues(String value){
        this.value = value;
    }
}
