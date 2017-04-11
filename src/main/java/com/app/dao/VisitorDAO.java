package com.app.dao;

import java.util.Collection;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.app.model.Visitor;

public interface VisitorDAO {
	public void addVisitor(Visitor Visitor);
	public Collection<Visitor> listVisitor();
	public Visitor getVisitor(int id);
	public Visitor getVisitor(String name);
	public void deleteVisitor(int id);
}

