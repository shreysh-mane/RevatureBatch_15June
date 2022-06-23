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
 * Servlet implementation class CView
 */
public class CView extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		Cookie[] cooki=request.getCookies();
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		if(cooki==null) {
			out.print("New User");
		}
		else {
			for(Cookie c:cooki) {
				if(c.getName().equals("username")) {
					String name=c.getValue();
					out.println("Login Success Welcome "+name);
				}
			}
		}
		
		
	}

}
