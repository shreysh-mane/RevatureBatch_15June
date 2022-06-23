package com.rev;

import java.io.IOException;

import jakarta.servlet.*;

public class SearchServlet implements Servlet {
	

	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("Creating the servlet Object");
		
	}

	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Inside Service processing req");
		
	}
	
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("Object is getting destroyed");
	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		System.out.println("inside getServletcon");
		return null;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		System.out.println("inside getServletInfo");
		return null;
	}

	
	
	
}
