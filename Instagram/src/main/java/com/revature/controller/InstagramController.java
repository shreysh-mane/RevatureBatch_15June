package com.revature.controller;

import java.util.ArrayList;

import com.revature.model.User;
import com.revature.service.InstagramService;

public class InstagramController {

	
	public ArrayList<User> registerUserController(User user) {
		InstagramService is=new InstagramService();
		ArrayList<User> users=is.registerUserService(user);
		return users;
	}

	public ArrayList<User> deleteUserController(String name) {
		// TODO Auto-generated method stub
		
		InstagramService is=new InstagramService();
		ArrayList<User> users=is.deleteUserService(name);
		return users;
		
	}

	
}
