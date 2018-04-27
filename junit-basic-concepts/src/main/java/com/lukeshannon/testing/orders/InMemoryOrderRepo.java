package com.lukeshannon.testing.orders;

import java.util.HashMap;
import java.util.Map;

public class InMemoryOrderRepo implements OrderRepo {
	
	private Map<Long,Order> orders = new HashMap<Long,Order>();

	@Override
	public Order placeOrder(Order order) {
		order.setId(new java.util.Date().getTime());
		order.setName(order.getName() + " (in memory)");
		orders.put(order.getId(), order);
		return orders.get(order.getId());
	}

	@Override
	public Order getOrder(long id) {
		return orders.get(id);
	}

}
