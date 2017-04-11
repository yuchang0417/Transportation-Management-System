package com.app.dao;


import java.util.Collection;

import javax.transaction.Transactional;


import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.app.model.User;





@Repository	
@Transactional
public class UserDAOImpl implements UserDAO {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	@Transactional
	public void addUser(User user) {
		sessionFactory.getCurrentSession().save(user);
	}

	@Override
	@Transactional
	public Collection<User> listuser() {
		return sessionFactory.getCurrentSession().createQuery("from User").list();
	}

	@Override
	@Transactional
	public User getUser(int id) {
		return (User) sessionFactory.getCurrentSession().load(User.class, id);
	}

	@Override
	@Transactional
	public void deleteUser(int id) {
		User student = getUser(id);
		if (student != null) {
			sessionFactory.getCurrentSession().delete(student);
			sessionFactory.getCurrentSession().flush();
		}
	}
		
	
}