package com.revature.hibernatedemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.revature.model.Emp;

public class EmpCreation {
	
	public static void main(String[] args) {
		
		Emp e1=new Emp();
		e1.setEmpname("syed");
		e1.setEmpaddress("kolkata");
		
		Emp e2=new Emp();
		e2.setEmpname("chitrak");
		e2.setEmpaddress("kolkata");
		
		Emp e3=new Emp();
		e3.setEmpname("renuka");
		e3.setEmpaddress("kolkata");
		
		Emp e4=new Emp();
		e4.setEmpname("shreysh");
		e4.setEmpaddress("kolkata");
		
		SessionFactory factory= new Configuration().configure().buildSessionFactory();
		
		
		Session session=factory.openSession();
		session.beginTransaction();
		session.save(e1);
		session.save(e2);
		session.getTransaction().commit();
		
		Session session1=factory.openSession();
		session1.beginTransaction();
		session1.save(e3);
		session1.save(e4);
		session1.getTransaction().commit();
		
		session1.close();
		session.close();
		
		
	}

}
