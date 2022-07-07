package com.revature.hibernatedemo;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.revature.model.Userdata;

//import org.hibernate.SessionFactory;
//import org.hibernate.cfg.*;

/**
 * Hello world!
 *
 */
public class SavingObject 

{
    public static void main( String[] args )
    {
        
    	

    	
//    	Creating the object
    	Userdata user=new Userdata();
    	user.setUserId(2);
    	user.setUserName("chitrak");
    	user.setUserAddress("kolkata");
    	user.setUseremail("chitrak@gmail.com");
    	
    	//creating sessionFactory object
//    	org.hibernate.cfg.Configuration cf=new org.hibernate.cfg.Configuration();
//    	cf.configure();
//    	SessionFactory factory=cf.buildSessionFactory();
    	
//    	Creating obj of sessionFactory
    	SessionFactory factory=new Configuration().configure().buildSessionFactory();
    	
//    	Creating sessoin obj from sessionFactory
    	Session session=factory.openSession();
    	
    	
//		for insert update delete you will need a transaction
//		start the transaction
    	session.beginTransaction();
    	
//		saving the object in database
    	session.save(user);
//		to commit your changes
    	session.getTransaction().commit();
    	session.close();
    	
    	
    	
    }
    
   
    
}
