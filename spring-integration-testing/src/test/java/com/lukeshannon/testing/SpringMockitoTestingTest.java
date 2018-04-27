package com.lukeshannon.testing;

import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Test;

import com.lukeshannon.testing.orders.Order;
import com.lukeshannon.testing.orders.OrderService;

/**
 * Unit test for simple App.
 */
public class SpringMockitoTestingTest 

{
	@Test
    public void testService() {
		OrderService orderService = mock(OrderService.class);
    	Order order = new Order(null,"New Order");
    	when(orderService.placeOrder(order)).thenReturn(new Order(1L, "Welcome to Mock Land!"));
    	System.out.println(orderService.placeOrder(order));
    	assertNotNull(orderService.placeOrder(order));
    }
}
