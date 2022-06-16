package com.revature.service;

import java.util.ArrayList;

import com.revature.dao.InstagramDAO;
import com.revature.model.User;

public class InstagramService {

	
	public ArrayList<User> registerUserService(User user) {
		InstagramDAO id=new InstagramDAO();
		ArrayList<User> users=id.registerUserDAO(user);
		return users;
	}

	public ArrayList<User> deleteUserService(String name) {
		
		InstagramDAO id=new InstagramDAO();
		ArrayList<User> users=id.deleteUserDAO(name);
		return users;
	}
}
