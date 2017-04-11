package com.app.dao;

import java.util.Collection;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import com.app.model.Visitor;

@Repository	
@Transactional
public class VisitorDAOImpl implements VisitorDAO {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	@Transactional
	public void addVisitor(Visitor Visitor) {
		sessionFactory.getCurrentSession().save(Visitor);
	}

	@Override
	@Transactional
	public Collection<Visitor> listVisitor() {
		return sessionFactory.getCurrentSession().createQuery("from Visitor").list();
	}

	@Override
	@Transactional
	public Visitor getVisitor(int id) {
		return (Visitor) sessionFactory.getCurrentSession().load(Visitor.class, id);
	}
	
	@Override
	@Transactional
	public Visitor getVisitor(String name) {

		Query bb= sessionFactory.getCurrentSession().createQuery("from Visitor where name =:haha");
		bb.setString("haha",name);
		Visitor mm= (Visitor) bb.uniqueResult();
		return mm;
	}


	@Override
	@Transactional
	public void deleteVisitor(int id) {
		Visitor student = getVisitor(id);
		if (student != null) {
			sessionFactory.getCurrentSession().delete(student);
			sessionFactory.getCurrentSession().flush();
		}
	}
		
	
}