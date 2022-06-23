package com.rev;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

public class SecondServlet extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Inside service of second Servlet");
		
		resp.setContentType("text/html");
		PrintWriter out= resp.getWriter();
		
		String Name="Shreysh";
		out.println("<h1> hello "+ Name+" </h1>");
		out.println("Hello there!!");
		
	}

}
