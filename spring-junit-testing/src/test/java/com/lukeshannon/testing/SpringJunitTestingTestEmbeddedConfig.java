package com.lukeshannon.testing;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.lukeshannon.testing.orders.InMemoryOrderRepo;
import com.lukeshannon.testing.orders.Order;
import com.lukeshannon.testing.orders.OrderRepo;
import com.lukeshannon.testing.orders.OrderService;

/**
 * Unit test for simple App.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration
public class SpringJunitTestingTestEmbeddedConfig 
{
	@Autowired
	private OrderService orderService;
	
	
	@Test
	public void testAttackWorks() {
		Order order = new Order(null,"New Order");
    	Order returnOrder = orderService.placeOrder(order);
    	assertNotNull(returnOrder);
	}
	
	@Configuration
	static class TestConfiguration {
		
		@Bean
		public OrderRepo orderRepo() {
			return new InMemoryOrderRepo();
			
		}
		
		@Bean
		public OrderService orderService(OrderRepo repo) {
			return new OrderService(repo);
		}
		
	}
}
