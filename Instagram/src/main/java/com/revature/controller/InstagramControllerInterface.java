package com.revature.controller;

import java.util.ArrayList;

import com.revature.model.User;

public interface InstagramControllerInterface {
	ArrayList<User> registerUserController(User user);
	
	ArrayList<User> deleteUserController(String name);
}
