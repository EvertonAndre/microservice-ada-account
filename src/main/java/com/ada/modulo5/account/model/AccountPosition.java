package com.ada.modulo5.account.model;

import jakarta.persistence.Entity;
import lombok.Data;

import java.util.List;

@Data
@Entity
public class AccountPosition {
//tem ligacao com a classe position - precisa identificar qual MS esta essa clase
    private String accountPositionDefinition;
    private String positionType;
    private List<String> position;
}
