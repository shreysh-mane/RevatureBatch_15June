package com.revature.springdemo.service;

import java.util.List;

import com.revature.springdemo.model.User;

public interface UserServiceInterface {
	
	void saveUseService(User user);

	List<User> getAllUser();

	User getUser(Long id);
}
