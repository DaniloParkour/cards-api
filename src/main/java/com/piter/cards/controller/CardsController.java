package com.piter.cards.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.piter.cards.model.Card;
import com.piter.cards.repository.CardRepository;

@RestController
@RequestMapping("/cards")
public class CardsController {
	
	@Autowired
	private CardRepository cardRepository;
	
	@GetMapping
	public List<Card> list() {
		return cardRepository.findAll();
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED) //Retorna o código 201(cadastro com sucesso)
	public Card add(@RequestBody Card card) {
		return cardRepository.save(card);
	}

}
