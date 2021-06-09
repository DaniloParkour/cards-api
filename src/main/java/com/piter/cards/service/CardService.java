package com.piter.cards.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.piter.cards.dto.card.CardDTO;
import com.piter.cards.dto.card.SaveCardDTO;
import com.piter.cards.mapper.GenericMapper;
import com.piter.cards.mapper.requests.ResponseModel;
import com.piter.cards.model.Card;
import com.piter.cards.repository.CardRepository;

@Service
public class CardService {
	
	@Autowired
	private CardRepository repository;
	
	@Autowired
	private GenericMapper mapper;
	
	
	public ResponseModel<CardDTO> save(SaveCardDTO card) {
		
		ResponseModel<CardDTO> response;
		
		try {
			
			//mapper from CardDTO to Card that is the parameter type for repository
			Card savedCard = repository.save( mapper.toObject(card, Card.class) );
			
			response = new ResponseModel<>("SUCCESS");
			response.setMessage("Card has been succesfully saved");
			
			//mapper from Card to CardDTO that is the parameter type for response
			response.setData( mapper.toObject(savedCard, CardDTO.class) );
			
		} catch (Exception e) {
			response = new ResponseModel<>("Error");
			response.setMessage("Can't save the Card");
		}
		
		return response;
		
	}
	
	public ResponseModel<CardDTO> listAll() {
		
		ResponseModel<CardDTO> response;
		
		try {
			List<Card> cards = repository.findAll();
			response = new ResponseModel<>("SUCCESS");
			response.setList(mapper.toList(cards, CardDTO.class));
		} catch (Exception e) {
			response = new ResponseModel<>("Error");
			response.setMessage("Can't list Cards");
		}
		
		return response;
		
	}
		
	public ResponseModel<Void> delete(Long id) {
		
		ResponseModel<Void> response;
		
		try {
			repository.deleteById(id);
			response = new ResponseModel<>("SUCCESS");
			response.setMessage("Card has been succesfully removed");
		} catch (Exception e) {
			response = new ResponseModel<>("Error");
			response.setMessage("Can't remove the Card");
		}
		
		return response;
		
	}
	
}
