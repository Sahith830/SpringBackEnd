package com.example.demo.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.sun.istack.NotNull;

import lombok.Data;

@Table(name = "user_info")
@Entity
@Data
public class User {
	@Id
	private Long id;
	@NotNull
	private String userName;
	
	@NotNull
	private String password;

	@OneToMany(fetch = FetchType.EAGER)
	@JoinColumn(name="creditcard_id")
	private List<CreditCard> creditcards;
	
}
