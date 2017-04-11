package com.app.dao;

import java.util.Collection;

import com.app.model.User;



public interface UserDAO {
	public void addUser(User user);
	public Collection<User> listuser();
	public User getUser(int id);
	public void deleteUser(int id);
	public void updateUser(User user);
}
