package com.revature.utility;

import com.revature.dao.InstagramDAO;
import com.revature.dao.InstagramDAOInterface;

public class DAOFactory {
	
	private DAOFactory() {}
	
	private static InstagramDAOInterface id;
	
	
	public static InstagramDAOInterface getInstance() {
		if(id==null) {
			id=new InstagramDAO();
		}
		return id;
	}
}
