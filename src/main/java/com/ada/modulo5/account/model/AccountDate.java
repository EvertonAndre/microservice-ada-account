package com.ada.modulo5.account.model;

import com.ada.modulo5.account.Enum.AccountDateTypeValues;
import jakarta.persistence.Entity;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Data
public class AccountDate {

    private AccountDateTypeValues accountDateType;
    private LocalDate accountDate;
}
