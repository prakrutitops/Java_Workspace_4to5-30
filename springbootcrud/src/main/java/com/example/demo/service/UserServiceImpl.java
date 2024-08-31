package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.User;
import com.example.demo.repo.UserRepo;

@Service
public class UserServiceImpl implements UserSErvice {

	@Autowired
	UserRepo repo;
	
	@Override
	public void addOrUpdateUser(User u) {
		// TODO Auto-generated method stub
		repo.save(u);
	}

	@Override
	public List<User> viewAllUser() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public void deleteUser(int id) {
		
		repo.deleteById(id);

	}

	@Override
	public User userById(int id) {
		// TODO Auto-generated method stub
		return repo.findById(id).orElseThrow();
	}

}
