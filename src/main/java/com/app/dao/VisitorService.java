package com.app.dao;

import java.util.Collection;

import com.app.model.Visitor;

public interface VisitorService {
	public void addVisitor(Visitor Visitor);
	public Collection<Visitor> listVisitor();
	public Visitor getVisitor(int id);
	public Visitor getVisitor(String name);
	public void deleteVisitor(int id);
}