package com.revature.hibernatedemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.revature.model.Userdata;

public class Test1 {
	
//	Creating obj of sessionFactory
	private static SessionFactory factory=new Configuration().configure().buildSessionFactory();

	public static void main(String[] args) {
		
		
		saveUser();
	}
	
	public static void deleteUser() {
		
		Session session=factory.openSession();
		long userId=2L;
		//initialize transaction
		session.beginTransaction();
		
		//get the date/obj from datebase on which you want to make changes
		Userdata user= (Userdata)session.get(Userdata.class, userId);
		
		//delete operation
		session.delete(user);
	
		
		//commit();
		session.getTransaction().commit();
		session.close();
		
	}
	
	
	public static void updateUser() {
		
		
		Session session=factory.openSession();
		long userId=100L;
		//initialize transaction
		session.beginTransaction();
		
		//get the date/obj from datebase on which you want to make changes
		Userdata user= (Userdata)session.get(Userdata.class, userId);
		//System.out.println(user.getUserName());
		
		//doing the changes
		user.setUserName("shreysh");
		user.setUserAddress("chennai");
		//save the updated obj in datebase
		session.saveOrUpdate(user);
		
		//commit();
		session.getTransaction().commit();
		session.close();
		
		
	}
	
	
	
	
	public static void fetchUser() {
		Session session=factory.openSession();
		long userId=2L;
		Userdata user= (Userdata)session.get(Userdata.class, userId);
		System.out.println(user.getUserName());
		
		session.close();
	}
	
	
	
	public static void saveUser() {
		
//		Creating the object
		Userdata user=new Userdata();
		user.setUserId(1);
		user.setUserName("chitrak");
		user.setUserAddress("kolkata");
		user.setUseremail("chitrak@gmail.com");
		
		Userdata user1=new Userdata();
		user1.setUserId(2);
		user1.setUserName("syed");
		user1.setUserAddress("kolkata");
		user1.setUseremail("chitrak@gmail.com");
		

		
//		Creating sessoin obj from sessionFactory
		Session session=factory.openSession();
		
		
//		for insert update delete you will need a transaction
//		start the transaction
		session.beginTransaction();
		
//		saving the object in database
//		session.save(user);
		session.saveOrUpdate(user1);
//		to commit your changes
		session.getTransaction().commit();
		session.close();
		
	}

}
