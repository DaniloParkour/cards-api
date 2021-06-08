package com.piter.cards.config.app;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Beans {
		
	@Bean
	public ModelMapper modelMapper() {
		return new ModelMapper();
	}
	
	/* ******************************************************************************
	Para o ModelMapper funcionar no projeto para fazermos as conversões com o mapper
	fazemos essa configuração para resolver o erro do tipo
	 
	***************************
	APPLICATION FAILED TO START
	***************************
	
	Description:
	
	Parameter 0 of constructor in com.piter.cards.mapper.GenericMapper required a bean of type 'org.modelmapper.ModelMapper' that could not be found.
	
	The injection point has the following annotations:
		- @org.springframework.beans.factory.annotation.Autowired(required=true)
	
	
	Action:
	
	Consider defining a bean of type 'org.modelmapper.ModelMapper' in your configuration.
	*/


}