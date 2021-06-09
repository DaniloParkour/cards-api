package com.piter.cards.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.piter.cards.dto.card.CardDTO;
import com.piter.cards.dto.card.SaveCardDTO;
import com.piter.cards.mapper.requests.ResponseModel;
import com.piter.cards.service.CardService;

@RestController
@RequestMapping("/cards")
public class CardsController {
	
	@Autowired
	private CardService service;
	
	@GetMapping
	public ResponseModel<CardDTO> list() {
		return service.listAll();
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED) //Return 201 HTTP code (success created)
	public ResponseModel<CardDTO> add(@Valid @RequestBody SaveCardDTO card) {
		return service.save(card);
	}
	
	@DeleteMapping("/{id}")
	public ResponseModel<Void> delete(@PathVariable("id") Long id) {
		return service.delete(id);
	}

}
