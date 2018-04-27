package com.lukeshannon.testing;


import com.lukeshannon.testing.orders.InMemoryOrderRepo;
import com.lukeshannon.testing.orders.Order;
import com.lukeshannon.testing.orders.OrderRepo;
import com.lukeshannon.testing.orders.OrderService;

/**
 * Basic Demo of a few concepts Spring incorportates to encourage good Object design
 *
 */
public class JunitBasic 
{
    public static void main( String[] args )
    {
    	OrderRepo orderRepo = new InMemoryOrderRepo();
    	OrderService orderService = new OrderService(orderRepo);
    	Order order = new Order(null,"New Order");
    	System.out.println(orderService.placeOrder(order));
    }
}
