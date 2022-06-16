package com.revature.utility;

import com.revature.service.InstagramService;
import com.revature.service.InstagramServiceInterface;

public class ServiceFactory {
	
	public ServiceFactory() {
		// TODO Auto-generated constructor stub
	}
	
	private static InstagramServiceInterface is;
	public static InstagramServiceInterface getInstance() {
		if(is==null) {
			is=new InstagramService();
		}
		return is;
	}

}
