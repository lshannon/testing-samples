package com.lukeshannon.testing;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.lukeshannon.testing.orders.Order;
import com.lukeshannon.testing.orders.OrderService;
import com.lukeshannon.testing.orders.OrderServiceConfiguration;

/**
 * Unit test for simple App.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ActiveProfiles("static")
@ContextConfiguration(classes= {OrderServiceConfiguration.class})
public class SpringJunitTestingTestProfileConfig 
{
	@Autowired
	private OrderService orderService;
	
	
	@Test
	public void testAttackWorks() {
		Order order = new Order(null,"New Order");
    	Order returnOrder = orderService.placeOrder(order);
    	assertThat(returnOrder.getName()).isNotBlank().containsIgnoringCase("static");
	}
	
}
