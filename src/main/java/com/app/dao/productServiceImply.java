package com.app.dao;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.model.product;

@Service

public class productServiceImply implements productService {
	
	@Autowired
	private productDAO productDAO;
	
	@Override
	@Transactional
	public void addproduct(product product) {
		productDAO.addproduct(product);
	}

	@Override
	@Transactional
	public Collection<product> listproduct() {
		return productDAO.listproduct();
	}

	@Override
	@Transactional
	public product getproduct(int id) {
		return productDAO.getproduct(id);
	}

	@Override
	@Transactional
	public void deleteproduct(int id) {
		productDAO.deleteproduct(id);
	}
}
