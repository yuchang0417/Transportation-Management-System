package com.app.dao;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.model.Order;

@Service

public class OrderServiceImply implements OrderService {
	
	@Autowired
	private OrderDAO OrderDAO;
	
	@Override
	@Transactional
	public void addOrder(Order Order) {
		OrderDAO.addOrder(Order);
	}

	@Override
	@Transactional
	public Collection<Order> listOrder() {
		return OrderDAO.listOrder();
	}

	@Override
	@Transactional
	public Order getOrder(int id) {
		return OrderDAO.getOrder(id);
	}

	@Override
	@Transactional
	public void deleteOrder(int id) {
		OrderDAO.deleteOrder(id);
	}
}
