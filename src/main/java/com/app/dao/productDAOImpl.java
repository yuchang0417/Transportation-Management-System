package com.app.dao;

import java.util.Collection;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.app.model.product;

@Repository	
@Transactional
public class productDAOImpl implements productDAO {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	@Transactional
	public void addproduct(product product) {
		sessionFactory.getCurrentSession().save(product);
	}

	@Override
	@Transactional
	public Collection<product> listproduct() {
		return sessionFactory.getCurrentSession().createQuery("from product").list();
	}

	@Override
	@Transactional
	public product getproduct(int id) {
		return (product) sessionFactory.getCurrentSession().load(product.class, id);
	}

	@Override
	@Transactional
	public void deleteproduct(int id) {
		product student = getproduct(id);
		if (student != null) {
			sessionFactory.getCurrentSession().delete(student);
			sessionFactory.getCurrentSession().flush();
		}
	}
		
	
}