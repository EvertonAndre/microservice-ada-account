package com.ada.modulo5.account.model;

import com.ada.modulo5.account.Enum.AccountInvolvementTypeValues;
import jakarta.persistence.Entity;
import lombok.Data;

@Entity
@Data
public class AccountInvolvement {

      private AccountInvolvementTypeValues accountInvolvement;
      private Account accountReference; //criar classe Account
      private Party partyReference; //nao to conseguindo importar a classe party do outro MS, apesar de ter colocado no pom
}
