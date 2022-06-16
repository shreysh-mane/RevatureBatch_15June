package com.revature.dao;

import java.util.ArrayList;

import com.revature.model.User;

public interface InstagramDAOInterface {
	
	ArrayList<User> registerUserDAO(User user);
	
	ArrayList<User> deleteUserDAO(String name);

}
