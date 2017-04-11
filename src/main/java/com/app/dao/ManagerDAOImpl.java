package com.app.dao;


import java.util.Collection;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.app.model.Manager;

@Repository	
@Transactional
public class ManagerDAOImpl implements ManagerDAO {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	@Transactional
	public void addManager(Manager Manager) {
		sessionFactory.getCurrentSession().save(Manager);
	}

	@Override
	@Transactional
	public Collection<Manager> listManager() {
		
		
		return sessionFactory.getCurrentSession().createQuery("from Manager").list();
	}

	@Override
	@Transactional
	public Manager getManager(int id) {
		
		
		
		return (Manager) sessionFactory.getCurrentSession().load(Manager.class, id);
	}
	
	
	

	@Override
	@Transactional
	public void deleteManager(int id) {
		Manager student = getManager(id);
		if (student != null) {
			sessionFactory.getCurrentSession().delete(student);
			sessionFactory.getCurrentSession().flush();
		}
	}
		
	
}
