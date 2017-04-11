package com.app.dao;

import java.util.Collection;

import com.app.model.Warehouse;

public interface WarehouseService {
	public void addWarehouse(Warehouse Warehouse);
	public Collection<Warehouse> listWarehouse();
	public Warehouse getWarehouse(int id);
	public void deleteWarehouse(int id);
}
