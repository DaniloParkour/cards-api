package com.piter.cards.dto.card;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CardDTO {
	private long id;
	private String name;
	private String description;
	private String urlImage;
	private String type; //MINION, BOSS, EFFECT, FIELD
	private int manaCost;
	private int damage;
	private int hp;
}