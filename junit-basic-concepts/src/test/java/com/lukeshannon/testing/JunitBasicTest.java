package com.lukeshannon.testing;

import static org.junit.Assert.assertNotNull;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.lukeshannon.testing.orders.InMemoryOrderRepo;
import com.lukeshannon.testing.orders.NonValidIdException;
import com.lukeshannon.testing.orders.Order;
import com.lukeshannon.testing.orders.OrderRepo;
import com.lukeshannon.testing.orders.OrderService;

/**
 * Unit test for simple App.
 */
public class JunitBasicTest 
{
	
	private static OrderRepo orderRepo = new InMemoryOrderRepo();
	private static OrderService orderService;

	@BeforeClass
	public static void initForTestClass() {
		System.out.println("Ran once at the start of all tests in this class");
		orderService = new OrderService(orderRepo);
		System.out.println("Service created");
		
	}
 	
	@Before
	public void initForEachTest() {
		System.out.println("Ran once at the start of each test");
		
	}
	
	@Test
    public void testService() {
    	Order order = new Order(null,"New Order");
    	assertNotNull(orderService.placeOrder(order));
    	
    }
	
	@Test (expected = NonValidIdException.class)
	public void testServiceException() throws NonValidIdException {
			orderService.getOrder(Long.valueOf(-1));
	}
    
	@After
    public void cleanUpForEachTest() {
		System.out.println("Ran once at the end of each test");
    }
	
	@AfterClass
	public static void cleanUpForTestClass() {
		System.out.println("Ran once at the end of all tests in this class");
	}
}
