package com.revature.cache;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.revature.model.Emp;

public class SessionLevel {
	
	public static void main(String[] args) {
		
		SessionFactory factory= new Configuration().configure().buildSessionFactory();
		
		Session session=factory.openSession();
		Emp emp=(Emp)session.get(Emp.class, 2L);
		System.out.println(emp.getEmpname());
		
		Emp emp1=(Emp)session.get(Emp.class, 2L);
		System.out.println(emp1.getEmpname());
		session.close();
		
		Session session1=factory.openSession();
		Emp emp2=(Emp)session1.get(Emp.class, 2L);
		System.out.println(emp2.getEmpname());
		session1.close();
	}

}
