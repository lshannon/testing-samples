package com.lukeshannon.testing.orders;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.lukeshannon.testing.orders")
public class OrderServiceConfiguration {
	
	@Bean
	public OrderService orderService(OrderRepo repo) {
		return new OrderService(repo);
	}

}
