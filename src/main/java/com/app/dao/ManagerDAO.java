package com.app.dao;

import java.util.Collection;

import com.app.model.Manager;


public interface ManagerDAO {
	public void addManager(Manager Manager);
	public Collection<Manager> listManager();
	public Manager getManager(int id);
	
	public void deleteManager(int id);
}