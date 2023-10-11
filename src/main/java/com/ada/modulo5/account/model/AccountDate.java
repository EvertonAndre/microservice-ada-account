package com.ada.modulo5.account.model;

import com.ada.modulo5.account.Enum.AccountDateTypeValues;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Data
public class AccountDate {
	
    @Id
    @GeneratedValue
    private Long id;
    private AccountDateTypeValues accountDateType;
    private LocalDate accountDate;
}
