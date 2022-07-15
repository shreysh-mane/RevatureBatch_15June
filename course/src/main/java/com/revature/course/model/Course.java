package com.revature.course.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Course {
	@Id
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
