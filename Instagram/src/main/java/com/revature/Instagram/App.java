package com.revature.Instagram;

import java.util.ArrayList;
import java.util.Scanner;

import com.revature.controller.InstagramController;
import com.revature.controller.InstagramControllerInterface;
import com.revature.model.User;
import com.revature.utility.ControllerFactory;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Scanner scn= new Scanner(System.in);
        boolean flag=true;
        
        while(flag) {
    	System.out.println("1. Register User");
        System.out.println("2. Delete User");
        System.out.println("Enter your choice");
       int ch=scn.nextInt();
       
       	if(ch==1) {
       		System.out.println("Enter the name");
       		String Name=scn.next();
       		System.out.println("Enter address of user");
       		String add=scn.next();
       		
       		User user=new User();
       		user.setName(Name);
       		user.setAdd(add);
       		
       		InstagramControllerInterface ic=ControllerFactory.getInstance();
       		ArrayList<User> users=ic.registerUserController(user);
       		
       		System.out.println("Users name");
       		for(User user1: users) {
       			System.out.println(user1.getName());
       		}
    	   
       }else if(ch==2) {
    	   	System.out.println("Enter the name");
      		String Name=scn.next();
      		
      		InstagramControllerInterface ic=ControllerFactory.getInstance();
      		ArrayList<User> users=ic.deleteUserController(Name);
      		
      		System.out.println("Users name");
      		for(User user1: users) {
       			System.out.println(user1.getName());
       		}
    	   
       }else {
    	   flag=false;
       }
        
       
       
        }
    }
}
