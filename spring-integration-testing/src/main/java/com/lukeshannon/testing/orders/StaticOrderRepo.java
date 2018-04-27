package com.lukeshannon.testing.orders;

public class StaticOrderRepo implements OrderRepo {

	@Override
	public Order placeOrder(Order order) {
		return new Order(1L, "Static Order Placed");
	}

	@Override
	public Order getOrder(long id) {
		return new Order(id, "Static Order Retrieved");
	}

}
