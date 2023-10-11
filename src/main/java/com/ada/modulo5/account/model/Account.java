package com.ada.modulo5.account.model;

import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.Data;
import lombok.ToString;

@Entity
@Data
@ToString
public class Account {

	@Id
	@GeneratedValue
	private Long id;

	@Column(columnDefinition  = "AC_IDENTIFICATION")
	private AccountIdentification accountIdentification;

	@Column(columnDefinition  = "AC_STATUS")
	private AccountStatus accountStatus;

	@OneToMany
	private Set<AccountDate> accountDate;

	private AccountType accountType;

	private String accountPurpose;

	@OneToMany
	private Set<AccountBalance> accountBalances;

	@OneToMany
	private Set<AccountCurrency> accountCurrency;

	private String accountDescription;
}
