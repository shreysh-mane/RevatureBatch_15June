package com.revature.hql;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.revature.model.Emp;



public class HQLDemo {
	
	public static void main(String[] args) {
		
		
	
		//Fetch the data from tabel.
		
		SessionFactory factory= new Configuration().configure().buildSessionFactory();
		Session session=factory.openSession();
		
		// to get complete tabel data
		//inside createQuery you will write HQL query.
//		Query q= session.createQuery("From Emp");
//		List<Emp> empList = q.list();
//		
//		for(Emp emp: empList) {
//			System.out.println(emp.getEmpname());
//			System.out.println(emp.getEmpid());
//			System.out.println(emp.getEmpaddress());
//		}
		
		// to select particular columns
//		Query q= session.createQuery("select e.empname,e.empaddress From Emp as e");
//		List<Object[]>	empList = q.list();
//		
//		for(Object[] emp: empList) {
////			System.out.println(Arrays.toString(emp));
//			System.out.println(emp[0]);
//			
//		}
		
		//where condition in hql
//		Query q= session.createQuery("select e.empname,e.empaddress From Emp as e where e.empname='shreysh'");
//		List<Object[]>	empList = q.list();
//		
//		for(Object[] emp: empList) {
//			System.out.println(Arrays.toString(emp));
////			System.out.println(emp[0]);
//			
//		}
		
		//delete command in hql
		// & and dynamically enter value is query
//		session.beginTransaction();
//		Query q= session.createQuery("delete From Emp as e where e.empname=:name");
//		q.setParameter("name", "syed"); 
//		int i= q.executeUpdate();
//		 System.out.println(i);
//		session.getTransaction().commit();
//		session.close();
		
		

		
		
	}
}
