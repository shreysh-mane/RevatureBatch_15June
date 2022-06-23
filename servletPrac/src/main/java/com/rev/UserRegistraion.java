package com.rev;


import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.*;
import jakarta.servlet.http.*;


public class UserRegistraion extends HttpServlet {
	
	public void doPost(HttpServletRequest req,HttpServletResponse resp)throws ServletException, IOException{
		
		System.out.println("Inside Do post method");
		
	}
	
	public void doGet(HttpServletRequest req,HttpServletResponse resp)throws ServletException, IOException{
		
		String name=req.getParameter("userName");
		String address=req.getParameter("userAddress");
		
		
		
		resp.setContentType("text/html");
		PrintWriter out=   resp.getWriter();
		out.println("<h1> Welcome "+ name+"</h1> <br><br>");
		out.println("<h1> you registered with "+ address+" location </h1> <br><br>");
		
	}
	
	
}
