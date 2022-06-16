package com.revature.controller;

import java.util.ArrayList;

import com.revature.model.User;
import com.revature.service.InstagramService;
import com.revature.service.InstagramServiceInterface;
import com.revature.utility.ServiceFactory;

public class InstagramController implements InstagramControllerInterface {

	public InstagramController() {
		System.out.println("Controller obj created");
	}
	
	public ArrayList<User> registerUserController(User user) {
		InstagramServiceInterface is=ServiceFactory.getInstance();
		ArrayList<User> users=is.registerUserService(user);
		return users;
	}

	public ArrayList<User> deleteUserController(String name) {
		// TODO Auto-generated method stub
		
		InstagramServiceInterface is=ServiceFactory.getInstance();
		ArrayList<User> users=is.deleteUserService(name);
		return users;
		
	}

	
}
