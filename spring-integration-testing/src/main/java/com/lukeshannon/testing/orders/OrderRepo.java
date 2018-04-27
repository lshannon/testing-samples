package com.lukeshannon.testing.orders;

public interface OrderRepo {
	
	public Order placeOrder(Order order);
	public Order getOrder(long id);

}
