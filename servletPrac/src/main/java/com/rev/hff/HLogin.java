package com.rev.hff;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class HLogin
 */
public class HLogin extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name=request.getParameter("userName");
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.println(""
				+"<form action='HView' method='post'>"
				+ "<input type='hidden' name='username' value='"+name+"'>"
				+"<button type='submit'>Go to view profile </button>"
				+"</form>");
				
	}



}
