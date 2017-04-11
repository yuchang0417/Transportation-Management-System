package com.app.dao;

import java.util.Collection;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.app.model.Order;

@Repository	
@Transactional
public class OrderDAOImpl implements OrderDAO {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	@Transactional
	public void addOrder(Order Order) {
		sessionFactory.getCurrentSession().save(Order);
	}

	@Override
	@Transactional
	public Collection<Order> listOrder() {
		return sessionFactory.getCurrentSession().createQuery("from Order").list();
	}

	@Override
	@Transactional
	public Order getOrder(int id) {
		return (Order) sessionFactory.getCurrentSession().load(Order.class, id);
	}

	@Override
	@Transactional
	public void deleteOrder(int id) {
		Order student = getOrder(id);
		if (student != null) {
			sessionFactory.getCurrentSession().delete(student);
			sessionFactory.getCurrentSession().flush();
		}
	}
		
	
}
