package com.ada.modulo5.account.model;

import com.ada.modulo5.account.Enum.AccountRelationShipTylesValues;
import jakarta.persistence.Entity;
import lombok.Data;

@Entity
@Data
public class AccountRelationship {

    private AccountRelationShipTylesValues accountRelationshipType;
    private Account fromAccount;
    private Account toAccount;

}
