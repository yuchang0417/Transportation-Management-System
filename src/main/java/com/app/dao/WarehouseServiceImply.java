package com.app.dao;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.model.Warehouse;


@Service
public class WarehouseServiceImply implements WarehouseService {
	
	@Autowired
	private WarehouseDAO WarehouseDAO;
	
	@Override
	@Transactional
	public void addWarehouse(Warehouse Warehouse) {
		WarehouseDAO.addWarehouse(Warehouse);
	}

	@Override
	@Transactional
	public Collection<Warehouse> listWarehouse() {
		return WarehouseDAO.listWarehouse();
	}

	@Override
	@Transactional
	public Warehouse getWarehouse(int id) {
		return WarehouseDAO.getWarehouse(id);
	}

	@Override
	@Transactional
	public void deleteWarehouse(int id) {
		WarehouseDAO.deleteWarehouse(id);
	}
}
