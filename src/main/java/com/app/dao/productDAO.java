package com.app.dao;

import java.util.Collection;

import com.app.model.product;



public interface productDAO {
	public void addproduct(product product);
	public Collection<product> listproduct();
	public product getproduct(int id);
	public void deleteproduct(int id);
}
