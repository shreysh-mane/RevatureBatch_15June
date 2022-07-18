package com.revature.springdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AspectDemo {
	
	
	@Before(value="execution(* com.revature.springdemo.controller.UserController.getAllUser())")
	public void userfetch() {
		System.out.println("Fetching the users");
	}

}
