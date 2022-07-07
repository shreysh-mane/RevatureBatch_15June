package com.revature.Ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	public static void main(String[] args) {
		
		
		ApplicationContext context=new ClassPathXmlApplicationContext("bean.xml");
		Person p= context.getBean("person",Person.class);
//		System.out.println(p.getName());
//		System.out.println(p.getAddress());
		p.getJob().method();
	
		
	}

}
