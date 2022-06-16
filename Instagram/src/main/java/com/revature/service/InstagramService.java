package com.revature.service;

import java.util.ArrayList;

import com.revature.dao.InstagramDAO;
import com.revature.dao.InstagramDAOInterface;
import com.revature.model.User;

public class InstagramService implements InstagramServiceInterface{

	
	public ArrayList<User> registerUserService(User user) {
		InstagramDAOInterface id=new InstagramDAO();
		ArrayList<User> users=id.registerUserDAO(user);
		return users;
	}

	public ArrayList<User> deleteUserService(String name) {
		
		InstagramDAOInterface id=new InstagramDAO();
		ArrayList<User> users=id.deleteUserDAO(name);
		return users;
	}
}
