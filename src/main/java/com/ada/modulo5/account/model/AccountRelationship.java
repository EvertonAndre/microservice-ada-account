package com.ada.modulo5.account.model;

import com.ada.modulo5.account.Enum.AccountRelationShipTylesValues;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class AccountRelationship {
    @Id
    @GeneratedValue
    private Long id;
    private AccountRelationShipTylesValues accountRelationshipType;
    @OneToOne
    @JoinColumn(name = "fromAccount")
    private Account fromAccount;
    @OneToOne
    @JoinColumn(name = "toAccount")
    private Account toAccount;

}
