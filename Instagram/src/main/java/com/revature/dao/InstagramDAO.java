package com.revature.dao;

import java.util.ArrayList;

import com.revature.model.User;

public class InstagramDAO implements InstagramDAOInterface{
	
	public InstagramDAO() {
		System.out.println("DAO object created");
	}
	
	
	private static ArrayList<User> users=new ArrayList<User>();
	
	public ArrayList<User> registerUserDAO(User user) {
		users.add(user);
		return users;
	}

	public ArrayList<User> deleteUserDAO(String name) {
		
		int i=0;
		for(;i<users.size();i++) {
			if(name.equalsIgnoreCase(users.get(i).getName())) {
				break;
			}
		}
		users.remove(i);
		return users;
	}

}
