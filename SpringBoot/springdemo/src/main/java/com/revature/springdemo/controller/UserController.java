package com.revature.springdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//@Controller
@RestController
@CrossOrigin("*")
public class UserController {
	
//	@RequestMapping(value="/getuser",method = RequestMethod.GET )
	
//	public void getUser() {
//		System.out.println("fetching the user");
//	}
//	
	
	

	@GetMapping(value="/getuser")
	public void getUser() {
		System.out.println("fetching the user");
	}
	
	@GetMapping(value="/getusername")
//	@ResponseBody
	public String getUsername() {
		System.out.println("getting the user name");
		return "getting name";
	}
	
//  @RequestMapping(value="/getuser",method = RequestMethod.POST )
//	@PostMapping(value="/getuser")
	
	
}