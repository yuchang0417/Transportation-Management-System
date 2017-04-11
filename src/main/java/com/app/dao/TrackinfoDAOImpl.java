package com.app.dao;

import java.util.Collection;

import javax.transaction.Transactional;


import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.app.model.Trackinfo;





@Repository	
@Transactional
public class TrackinfoDAOImpl implements TrackinfoDAO {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	@Transactional
	public void addTrackinfo(Trackinfo Trackinfo) {
		sessionFactory.getCurrentSession().save(Trackinfo);
	}

	@Override
	@Transactional
	public Collection<Trackinfo> listTrackinfo() {
		return sessionFactory.getCurrentSession().createQuery("from Trackinfo").list();
	}

	@Override
	@Transactional
	public Trackinfo getTrackinfo(int id) {
		return (Trackinfo) sessionFactory.getCurrentSession().load(Trackinfo.class, id);
	}

	@Override
	@Transactional
	public void deleteTrackinfo(int id) {
		Trackinfo trackinfo = getTrackinfo(id);
		if (trackinfo != null) {
			sessionFactory.getCurrentSession().delete(trackinfo);
			sessionFactory.getCurrentSession().flush();
		}
	}
		
	
}