package com.ada.modulo5.account.model;

import com.ada.modulo5.account.Enum.AccountCurrencyTypeValues;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class AccountCurrency {
    @Id
    @GeneratedValue
    private Long id;
    private AccountCurrencyTypeValues accountCurrencyType;
    private Long currencyCode; //Era pra ser do tipo currencyCode, mas nao encontrei no diagrama
}
