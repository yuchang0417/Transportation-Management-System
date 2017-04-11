package com.app.dao;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.model.Visitor;

@Service

public class VisitorServiceImply implements VisitorService {
	
	@Autowired
	private VisitorDAO VisitorDAO;
	
	@Override
	@Transactional
	public void addVisitor(Visitor Visitor) {
		VisitorDAO.addVisitor(Visitor);
	}

	@Override
	@Transactional
	public Collection<Visitor> listVisitor() {
		return VisitorDAO.listVisitor();
	}

	@Override
	@Transactional
	public Visitor getVisitor(int id) {
		return VisitorDAO.getVisitor(id);
	}
	
	@Override
	@Transactional
	public Visitor getVisitor(String name) {
		return VisitorDAO.getVisitor(name);
	}

	@Override
	@Transactional
	public void deleteVisitor(int id) {
		VisitorDAO.deleteVisitor(id);
	}
}
