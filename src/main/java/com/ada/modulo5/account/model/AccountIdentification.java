package com.ada.modulo5.account.model;

import com.ada.modulo5.account.Enum.AccountIdentificationTypeValues;
import jakarta.persistence.Entity;
import lombok.Data;

@Entity
@Data
public class AccountIdentification {

    private AccountIdentificationTypeValues accountIdentificationType;
    private AccountIdentification identifier;
}
