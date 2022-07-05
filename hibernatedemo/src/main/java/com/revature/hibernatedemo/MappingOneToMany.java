package com.revature.hibernatedemo;

import java.util.ArrayList;
import java.util.List;
import java.util.zip.CheckedOutputStream;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.revature.model.Course;
import com.revature.model.Student;

public class MappingOneToMany {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Student s1=new Student();
//		s1.setSname("syed");
//		
//		Course c1=new Course();
//		c1.setCname("Maths");
//		c1.setStudent(s1);
//		
//		Course c2=new Course();
//		c2.setCname("english");
//		c2.setStudent(s1);
//		
//		List<Course> clist=new ArrayList<Course>();
//		clist.add(c2);
//		clist.add(c1);
//		
//		s1.setCourse(clist);
//		
//		SessionFactory sessionFactory= new Configuration().configure().buildSessionFactory();
//		Session session=sessionFactory.openSession();
//		session.beginTransaction();
//		session.save(s1);
//		session.save(c1);
//		session.save(c2);
//		session.getTransaction().commit();
//		session.close();
		
		
		SessionFactory sessionFactory= new Configuration().configure().buildSessionFactory();
		Session session=sessionFactory.openSession();
		Student s1=	(Student)session.get(Student.class,1L);
		System.out.println(	s1.getSname());
		
		List<Course> clist=	s1.getCourse();
		for(Course course: clist) {
			System.out.println(course.getCname());
		}
	
		
		
		
		
	}

}
