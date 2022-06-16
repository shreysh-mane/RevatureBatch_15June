package com.revature.controller;

import java.util.ArrayList;

import com.revature.model.User;
import com.revature.service.InstagramService;
import com.revature.service.InstagramServiceInterface;

public class InstagramController {

	
	public ArrayList<User> registerUserController(User user) {
		InstagramServiceInterface is=new InstagramService();
		ArrayList<User> users=is.registerUserService(user);
		return users;
	}

	public ArrayList<User> deleteUserController(String name) {
		// TODO Auto-generated method stub
		
		InstagramServiceInterface is=new InstagramService();
		ArrayList<User> users=is.deleteUserService(name);
		return users;
		
	}

	
}
