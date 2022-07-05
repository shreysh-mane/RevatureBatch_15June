package com.revature.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Student {

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long sid;
	private String sname;
	
//	@OneToOne(mappedBy = "student")
	@OneToMany(mappedBy="student")
	private List<Course> course;
	

	public List<Course> getCourse() {
		return course;
	}
	public void setCourse(List<Course> course) {
		this.course = course;
	}
	public long getSid() {
		return sid;
	}
	public void setSid(long sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	
	
	
	
	
}
