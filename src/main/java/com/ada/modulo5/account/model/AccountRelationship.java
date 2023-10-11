package com.ada.modulo5.account.model;

import com.ada.modulo5.account.Enum.AccountRelationShipTylesValues;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class AccountRelationship {
    @Id
    @GeneratedValue
    private Long id;
    private AccountRelationShipTylesValues accountRelationshipType;
    private Account fromAccount;
    private Account toAccount;

}
