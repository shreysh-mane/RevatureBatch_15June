package com.rev.configcontext;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class ConfigContext2 extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		

		ServletContext ctx=	request.getServletContext();
		String datevalue=ctx.getInitParameter("date");
		
		response.setContentType("text/html");
		PrintWriter out= response.getWriter();
		out.print("<h1> Date value is"+ datevalue+"</h1>");
		
	}

}