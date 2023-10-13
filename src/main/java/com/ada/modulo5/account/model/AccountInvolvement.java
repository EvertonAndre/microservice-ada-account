package com.ada.modulo5.account.model;

import com.ada.modulo5.account.Enum.AccountInvolvementTypeValues;

//import br.com.ada.party.model.Party;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class AccountInvolvement {
	@Id
	@GeneratedValue
	private Long id;
	private AccountInvolvementTypeValues accountInvolvement;
	@OneToOne
	@JoinColumn(name = "accountReference")
	private Account accountReference; // criar classe Account
//	private Party partyReference; // nao to conseguindo importar a classe party do outro MS, apesar de ter
//									// colocado no pom
}
