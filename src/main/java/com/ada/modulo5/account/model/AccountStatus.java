package com.ada.modulo5.account.model;

import com.ada.modulo5.account.Enum.AccountStatusTypeValues;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class AccountStatus {
    @Id
    @GeneratedValue
    private Long id;
    private String status;
    private AccountStatusTypeValues accountStatusType;
}
