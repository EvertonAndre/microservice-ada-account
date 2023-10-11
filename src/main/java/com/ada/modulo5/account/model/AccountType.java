package com.ada.modulo5.account.model;

import com.ada.modulo5.account.Enum.AccountTypeValues;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class AccountType {
	
    @Id
    @GeneratedValue
    private Long id;
    private AccountTypeValues accountType;
    private String accountTypeName;
}
