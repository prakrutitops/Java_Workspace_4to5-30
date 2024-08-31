package com.example.demo.service;

import java.util.List;

import com.example.demo.model.User;

public interface UserSErvice {
		
	
			public void addOrUpdateUser(User u);
			public List<User> viewAllUser();
			public void deleteUser(int id);
			public User userById(int id);
}
