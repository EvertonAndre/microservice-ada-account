package com.ada.modulo5.account.model;

import com.ada.modulo5.account.Enum.AccountTypeValues;
import jakarta.persistence.Entity;
import lombok.Data;

@Entity
@Data
public class AccountType {

    private AccountTypeValues accountType;
    private String accountTypeName;
}
