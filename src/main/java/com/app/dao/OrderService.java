package com.app.dao;

import java.util.Collection;

import com.app.model.Order;

public interface OrderService {
	public void addOrder(Order Order);
	public Collection<Order> listOrder();
	public Order getOrder(int id);
	public void deleteOrder(int id);
}
