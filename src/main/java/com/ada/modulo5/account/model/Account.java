package com.ada.modulo5.account.model;

import java.util.Set;

import jakarta.persistence.*;
import lombok.Data;
import lombok.ToString;

@Entity
@Data
@ToString
public class Account {

	@Id
	@GeneratedValue
	private Long id;

	@OneToOne
	@JoinColumn(name = "AC_IDENTIFICATION")
	private AccountIdentification accountIdentification;

	@OneToOne
	@JoinColumn(name  = "AC_STATUS")
	private AccountStatus accountStatus;

	@OneToMany
	private Set<AccountDate> accountDate;

	@OneToOne
	@JoinColumn(name = "accountType")
	private AccountType accountType;

	private String accountPurpose;

	@OneToMany
	private Set<AccountBalance> accountBalances;

	@OneToMany
	private Set<AccountCurrency> accountCurrency;

	private String accountDescription;
}
