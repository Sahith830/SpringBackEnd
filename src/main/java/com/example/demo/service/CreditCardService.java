package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.CreditCard;
import com.example.demo.repository.CreditCardRepostiory;

@Service
public class CreditCardService {
	@Autowired
	private CreditCardRepostiory cardRepostiory;
	
	public List<CreditCard> addCreditCard(List<CreditCard> creditcards) {
		return cardRepostiory.saveAll(creditcards);
	}
}
