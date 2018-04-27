package com.lukeshannon.testing.orders;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("inmemory")
public class InMemoryRepoConfg {
	
	@Bean
	public OrderRepo orderRepo() {
		return new InMemoryOrderRepo();
		
	}
	

}
