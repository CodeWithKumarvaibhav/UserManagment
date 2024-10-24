package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;

@Service
public class UserServiceImpl  implements UserService{
    @Autowired
	UserRepository userrepostory;

	@Override
	public void createuser(User user) {
		userrepostory.save(user);
		
	}

	@Override
	public void deleteUser(int id) {
		userrepostory.deleteById(id);
		
	}

	@Override
	public User getUser(int id) {
		
		User u = userrepostory.findById(id).get();
		return u;
		
		
		
	}
    
	



	
}
