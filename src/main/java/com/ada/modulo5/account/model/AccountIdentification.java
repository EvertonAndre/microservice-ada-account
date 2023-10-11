package com.ada.modulo5.account.model;

import com.ada.modulo5.account.Enum.AccountIdentificationTypeValues;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.ToString;

@Entity
@Data
@ToString
public class AccountIdentification {
    @Id
    @GeneratedValue
    private Long id;
    
    private AccountIdentificationTypeValues accountIdentificationType;
    private String identifier;
}
