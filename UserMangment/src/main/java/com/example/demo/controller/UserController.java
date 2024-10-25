package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.User;

import com.example.demo.service.UserService;

@RestController
public class UserController {
	@Autowired
	UserService user;
	@PostMapping("/add")
	public String addUser(@RequestBody User u)
	{
		user.createuser(u);
		return "done" ;
		
	}
	@DeleteMapping("delete/{id}")
	public String deleteUser(@PathVariable ("id")int id) {
		user.deleteUser(id);
		
		System.out.println("hiii..!");
		
		return "delete";
	}
	
}
