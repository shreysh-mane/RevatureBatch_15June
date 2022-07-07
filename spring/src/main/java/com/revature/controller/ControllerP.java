package com.revature.controller;

import org.springframework.beans.factory.annotation.Autowired;

import com.revature.service.ServiceP;

@RestController
public class ControllerP {
	
	@Autowired
	private ServiceP service;
	
	
	public void saveUser() {
		
		
		service.saveUser();
	}
}
