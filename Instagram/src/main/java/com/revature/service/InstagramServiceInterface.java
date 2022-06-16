package com.revature.service;

import java.util.ArrayList;

import com.revature.model.User;

public interface InstagramServiceInterface {

	
	ArrayList<User> registerUserService(User user);
	
	ArrayList<User> deleteUserService(String name);
}
