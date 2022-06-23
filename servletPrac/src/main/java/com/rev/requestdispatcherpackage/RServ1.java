package com.rev.requestdispatcherpackage;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class RServ1
 */
public class RServ1 extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String name=request.getParameter("userName");
		String pass=request.getParameter("userPass");
		
		
		
		if(name.equals("admin")&&pass.equals("adminpass")) {
			
			RequestDispatcher rd=request.getRequestDispatcher("/RServ2");
			rd.forward(request, response);
			
		}else {
			response.setContentType("text/html");
			PrintWriter out=response.getWriter();
			out.print("Wrong Password please try again");
			
			RequestDispatcher rd=request.getRequestDispatcher("/index.html");
			rd.include(request, response);
		
			
		}
		

	
		
	
	}

}
