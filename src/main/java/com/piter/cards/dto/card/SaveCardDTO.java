package com.piter.cards.dto.card;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

import com.piter.cards.model.Card;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SaveCardDTO {
	
	//When use SWAGGER, see the example below
	//@ApiModelProperty(position = 0, example = "Fulano 1", required = true)
	
	/*
	 @AssertTrue => Must be True (agree terms for example)
	 @DecimalMax("30.00") => Decimal Value is <= 30
	*/
	
	@NotBlank(message = "Name is required")
	private String name;
	
	private String description;
	
	@NotBlank(message = "Image URL is required")
	private String urlImage;
	
	@Min(value = 1, message = "Type cannot be less than 1")
	private int type; //MINION(1), BOSS(2), EFFECT(3), FIELD(4)
	
	@Min(value = 0, message = "Mana cost cannot be less than 0")
	@Max(value = 10, message = "Mana cost cannot be greater than 10")
	private int manaCost;
	
	@Min(value = 0, message = "Damage cannot be less than 0")
	@Max(value = 12, message = "Damage cannot be greater than 12")
	private int damage;
	
	@Min(value = 0, message = "HP cannot be less than 0")
	@Max(value = 20, message = "HP cannot be greater than 20")
	private int hp;
}
