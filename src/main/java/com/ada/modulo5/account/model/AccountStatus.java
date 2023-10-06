package com.ada.modulo5.account.model;

import com.ada.modulo5.account.Enum.AccountStatusTypeValues;
import jakarta.persistence.Entity;
import lombok.Data;


@Entity
@Data
public class AccountStatus {

    private AccountStatus status;
    private AccountStatusTypeValues accountStatusType;
}
