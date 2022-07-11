package com.revature.springdemo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.revature.springdemo.model.User;
import com.revature.springdemo.service.UserService;
import com.revature.springdemo.service.UserServiceInterface;

//@Controller
@RestController
@CrossOrigin("*")
@RequestMapping("/api/user")
public class UserController {
	
//	@RequestMapping(value="/getuser",method = RequestMethod.GET )
//	public void getUser() {
//		System.out.println("fetching the user");
//	}
//		

//	@GetMapping(value="/getuser")
//	public void getUser() {
//		System.out.println("fetching the user");
//	}
//	
//	@GetMapping(value="/getusers")
//	@ResponseBody
//	public String getUsers() {
//		return "gettin users";
//	}
//	

//	@GetMapping(value="/getusers")
//	public String getUsers() {
//		return "getting users";
//	}

	
//	@GetMapping(value="/users")
//	public String getAllUser() {
//		System.out.print("got the req dwdw");
//		return "Getting all the users in db";
//		
//	
//	}
	
//	@GetMapping(value="/users")
//	public List<User> getAllUser() {
//		System.out.print("got the req dwdw");
//		User u=new User();
//		u.setName("shre");
//		
//		User u1=new User();
//		u1.setName("shre");
//		
//		List<User> ul=new ArrayList<User>();
//		ul.add(u1);
//		ul.add(u);
//		
//		return ul;
//		
//		
//	
//	}
//	
//	@GetMapping(value="/userbyid/{id}")
//	public String getUserById(@PathVariable Long id) {
//		return ("Getting user based on id " + id);
//	}
//	
//
//	@PostMapping("/finguserwithname")
//	public String prameterdemo(@RequestParam("name") String name,@RequestParam("address") String address) {
//		System.out.println("Hello");
//		System.out.println(name);
//		System.out.println(address);
//		return ("hello" +name + address) ;
//	}
//	
//	
//	@PostMapping("/saveuser")
//	public void saveuser(@RequestBody User user) {
//		System.out.print("hello");
//		System.out.print(user.getName());
//		System.out.print(user.getAddress());
//		
//	}
	
	
// Started Sping DATA
	
	@Autowired
	private UserServiceInterface userServiceInterface;
	
	@PostMapping("/saveuser")
	public void saveuser(@RequestBody User user) {
		
		userServiceInterface.saveUseService(user);
		
	}
	
	@GetMapping("/getallusers")
	public List<User> getAllUser() {
		
		List<User> uslist=userServiceInterface.getAllUser();
		return uslist;
	}
	
	@GetMapping("/getuser/{id}")
	public User getuser(@PathVariable Long id) {
		return userServiceInterface.getUser(id);
	}
	
	
	
	
}
