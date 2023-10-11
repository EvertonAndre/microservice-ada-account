package com.ada.modulo5.account.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

import java.util.List;

@Data
@Entity
public class AccountPosition {
//tem ligacao com a classe position - precisa identificar qual MS esta essa clase
    @Id
    @GeneratedValue
    private Long id;
    private String accountPositionDefinition;
    private String positionType;
    private List<String> position;
}
