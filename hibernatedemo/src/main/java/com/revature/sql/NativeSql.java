package com.revature.sql;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.revature.model.Emp;

public class NativeSql {
	
	public static void main(String[] args) {
		
		
		SessionFactory factory= new Configuration().configure().buildSessionFactory();
		Session session=factory.openSession();
		
		// to get complete tabel data
		Query q= session.createSQLQuery("select * From Emp");
		List<Object[]> empList = q.list();
		
		for(Object[] emp: empList) {
			System.out.println(Arrays.toString(emp));
		}
	}

}
