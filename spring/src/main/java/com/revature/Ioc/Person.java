package com.revature.Ioc;

import org.springframework.beans.factory.annotation.Autowired;

public class Person {
	
//	private String name;
//	private String address;
	
	
	@Autowired
	private Job job;
	
	
	public Job getJob() {
		return job;
	}

	public void setJob(Job job) {
		this.job = job;
	}

//	public Person(String name,String address) {
//		// TODO Auto-generated constructor stub
//		this.name=name;
//		this.address=address;
//	}
	
//	public String getName() {
//		return name;
//	}
//
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//
//	public String getAddress() {
//		return address;
//	}
//
//
//	public void setAddress(String address) {
//		this.address = address;
//	}
//
//
//	public void alive() {
//		System.out.println("Person is alive");
//	}

}
