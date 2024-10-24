package com.example.demo.service;

import com.example.demo.entity.User;

public interface UserService {
	
	public void createuser(User user);
	
	public void deleteUser(int Id);
	
	public User getUser(int Id);
	

}
