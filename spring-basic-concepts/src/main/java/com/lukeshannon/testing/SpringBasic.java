package com.lukeshannon.testing;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.lukeshannon.testing.orders.Order;
import com.lukeshannon.testing.orders.OrderService;
import com.lukeshannon.testing.orders.OrderServiceConfiguration;

/**
 * Basic Demo of a few concepts Spring incorporates to encourage good OO design
 *
 */
public class SpringBasic 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new AnnotationConfigApplicationContext(OrderServiceConfiguration.class);
		OrderService orders = (OrderService) context.getBean(OrderService.class);
		System.out.println(orders.placeOrder(new Order(null,"Some Stuff")));
    }
}
