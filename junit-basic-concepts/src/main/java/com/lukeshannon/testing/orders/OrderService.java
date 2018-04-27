package com.lukeshannon.testing.orders;


public class OrderService {
	
	private OrderRepo repo;
	
	public OrderService(OrderRepo repo) {
		this.repo = repo;
	}
	
	public Order placeOrder(Order order) {
		return repo.placeOrder(order);
	}
	
	public Order getOrder(long id) {
		return repo.getOrder(id);
	}
	

}
