package com.ada.modulo5.account.model;

import java.time.LocalDate;

import com.ada.modulo5.account.Enum.StatusEnum;
import com.ada.modulo5.account.Enum.TypeEnum;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Transaction {
	
    @Id
    @GeneratedValue
    private Long id;

    @Enumerated(EnumType.STRING)
    private StatusEnum status;
    
    @Enumerated(EnumType.STRING)
    private TypeEnum type;
	
	@Column(name="NAME")
    private String name;
	
	@Column(name="DATA_CRIACAO")
    private LocalDate date;
	
	@Column(name="DESCRIPTION")
    private String description;

}
