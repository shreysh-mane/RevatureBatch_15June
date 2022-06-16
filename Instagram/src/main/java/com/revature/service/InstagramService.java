package com.revature.service;

import java.util.ArrayList;

import com.revature.dao.InstagramDAO;
import com.revature.dao.InstagramDAOInterface;
import com.revature.model.User;
import com.revature.utility.DAOFactory;

public class InstagramService implements InstagramServiceInterface{

	public InstagramService() {
		System.out.println("Service obj created");
	}
	
	public ArrayList<User> registerUserService(User user) {
		InstagramDAOInterface id=DAOFactory.getInstance();
		ArrayList<User> users=id.registerUserDAO(user);
		return users;
	}

	public ArrayList<User> deleteUserService(String name) {
		
		InstagramDAOInterface id=DAOFactory.getInstance();
		ArrayList<User> users=id.deleteUserDAO(name);
		return users;
	}
}
