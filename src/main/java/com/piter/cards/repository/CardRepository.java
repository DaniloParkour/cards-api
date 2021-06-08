package com.piter.cards.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.piter.cards.model.Card;

@Repository
public interface CardRepository extends JpaRepository<Card, Long> {
	
}
