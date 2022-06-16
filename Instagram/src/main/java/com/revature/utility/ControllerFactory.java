package com.revature.utility;

import com.revature.controller.InstagramController;
import com.revature.controller.InstagramControllerInterface;

public class ControllerFactory {
	
	private ControllerFactory() {
		
	}
	
	private static InstagramControllerInterface ic;
	
	public static InstagramControllerInterface getInstance() {
		if(ic==null) {
			ic=new InstagramController();
		}
		return ic;
	}

}
