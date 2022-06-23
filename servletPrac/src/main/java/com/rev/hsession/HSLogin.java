package com.rev.hsession;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class HSLogin
 */
public class HSLogin extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name=request.getParameter("userName");
		
		HttpSession session=request.getSession();
		session.setAttribute("username", name);
		session.setMaxInactiveInterval(2);
		
//		
//		response.setContentType("text/html");
//		PrintWriter out=response.getWriter();
//		out.println("Login Success Welcome HS "+name);
//		out.println("<a href='HSView'><button> Click here to View Profile</button></a>");
//		
		System.out.print("Inside HS"+name);
		
	}

}
