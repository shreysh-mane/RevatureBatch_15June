package com.rev.cookies;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class CLogin
 */
public class CLogin extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name=request.getParameter("userName");
		
		
		Cookie c=new Cookie("username",name);
		response.addCookie(c);
		
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.println("Login Success Welcome UC "+name);
		out.println("<a href='CView'><button> Click here to View Profile</button></a>");
	
	}

}
