package com.ada.modulo5.account.model;

import com.ada.modulo5.account.Enum.AccountBalanceTypeValues;
import jakarta.persistence.Entity;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Data
public class AccountBalance {

    private Double accountBalance; //Era pra ser do tipo Amount, mas nao encontrei essa classe no diagrama
    private AccountBalanceTypeValues accountBalanceType;
    private LocalDate accountBalanceDate;
}
