package com.app.dao;

import java.util.Collection;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.app.model.Warehouse;

@Repository	
@Transactional
public class WarehouseDAOImpl implements WarehouseDAO {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	@Transactional
	public void addWarehouse(Warehouse Warehouse) {
		sessionFactory.getCurrentSession().save(Warehouse);
	}

	@Override
	@Transactional
	public Collection<Warehouse> listWarehouse() {
		return sessionFactory.getCurrentSession().createQuery("from Warehouse").list();
	}

	@Override
	@Transactional
	public Warehouse getWarehouse(int id) {
		return (Warehouse) sessionFactory.getCurrentSession().load(Warehouse.class, id);
	}

	@Override
	@Transactional
	public void deleteWarehouse(int id) {
		Warehouse warehouse = getWarehouse(id);
		if (warehouse != null) {
			sessionFactory.getCurrentSession().delete(warehouse);
			sessionFactory.getCurrentSession().flush();
		}
	}
		
	
}