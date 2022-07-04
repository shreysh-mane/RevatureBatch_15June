package com.revature.hibernatedemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.revature.model.Course;
import com.revature.model.Student;

public class Mappinghibernate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
//		//create obj of student
//		Student st1=new Student();
//		st1.setSname("shreysh");
//		
//		
//		
//		//create obj of course
//		Course c1=new Course();
//		c1.setCname("Maths");
//		
//		
//		
//		//for relationship setting course obj in student class
//		st1.setCourse(c1);
//		c1.setStudent(st1);
//		
//		
//		
//	
//  
//    	SessionFactory factory=new Configuration().configure().buildSessionFactory();
//    	Session session=factory.openSession();
//    	session.beginTransaction();
//
//    	session.save(st1);
//    	session.save(c1);
//    	
//
//    	session.getTransaction().commit();
//    	session.close();
//		
		
		//fetching course data from student
		
		SessionFactory factory=new Configuration().configure().buildSessionFactory();
		Session session=factory.openSession();
		Student st1=(Student)session.get(Student.class, 1L);
		System.out.println(st1.getSname());
		System.out.println(st1.getCourse().getCname());
		
		
		//fetch student data from course
//		SessionFactory factory=new Configuration().configure().buildSessionFactory();
//		Session session=factory.openSession();
//		Course c1=(Course)session.get(Course.class, 2L);
//		System.out.println(c1.getCname());
//		System.out.println(c1.getStudent().getSname());

	}

}
