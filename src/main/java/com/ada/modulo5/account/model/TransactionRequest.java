package com.ada.modulo5.account.model;

import java.math.BigDecimal;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class TransactionRequest {
	
	@NotBlank
	private String idContaOrigem;
	
	@NotBlank
	private String idContaDestino;
	
	@NotNull
	private BigDecimal valor;
}