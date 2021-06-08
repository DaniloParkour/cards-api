package com.piter.cards.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.piter.cards.mapper.GenericMapper;
import com.piter.cards.repository.CardRepository;

@Service
public class CardService {
	
	@Autowired
	private CardRepository repository;
	
	@Autowired
	private GenericMapper mapper;
	
}
