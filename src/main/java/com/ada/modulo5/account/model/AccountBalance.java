package com.ada.modulo5.account.model;

import com.ada.modulo5.account.Enum.AccountBalanceTypeValues;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Data
public class AccountBalance {
    @Id
    @GeneratedValue
    private Long id;
    private BigDecimal balance;
    
    @Enumerated(EnumType.STRING)
    private AccountBalanceTypeValues balanceType;
    private LocalDate balanceDate;
}
