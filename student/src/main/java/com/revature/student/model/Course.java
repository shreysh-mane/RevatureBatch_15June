package com.revature.student.model;

import javax.persistence.Entity;
import javax.persistence.Id;


public class Course {
	
	private long cid;
	private String couresName;
	
	public long getCid() {
		return cid;
	}
	public void setCid(long cid) {
		this.cid = cid;
	}
	public String getCouresName() {
		return couresName;
	}
	public void setCouresName(String couresName) {
		this.couresName = couresName;
	}
	
	
}
