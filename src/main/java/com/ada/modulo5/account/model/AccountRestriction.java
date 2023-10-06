package com.ada.modulo5.account.model;

import jakarta.persistence.Entity;
import lombok.Data;

@Entity
@Data
public class AccountRestriction {

    private String accountRestrictionIdentifier;
    private String restrictionType;
    private String accountRestrictionDescription;

}
