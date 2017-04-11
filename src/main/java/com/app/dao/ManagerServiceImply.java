package com.app.dao;


import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.model.Manager;

@Service

public class ManagerServiceImply implements ManagerService {
	
	@Autowired
	private ManagerDAO ManagerDAO;
	
	@Override
	@Transactional
	public void addManager(Manager Manager) {
		ManagerDAO.addManager(Manager);
	}

	@Override
	@Transactional
	public Collection<Manager> listManager() {
		return ManagerDAO.listManager();
	}

	@Override
	@Transactional
	public Manager getManager(int id) {
		return ManagerDAO.getManager(id);
	}
	
	
	@Override
	@Transactional
	public void deleteManager(int id) {
		ManagerDAO.deleteManager(id);
	}
}
