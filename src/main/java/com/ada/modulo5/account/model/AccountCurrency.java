package com.ada.modulo5.account.model;

import com.ada.modulo5.account.Enum.AccountCurrencyTypeValues;
import jakarta.persistence.Entity;
import lombok.Data;

@Entity
@Data
public class AccountCurrency {

    private AccountCurrencyTypeValues accountCurrencyType;
    private Long currencyCode; //Era pra ser do tipo currencyCode, mas nao encontrei no diagrama
}
