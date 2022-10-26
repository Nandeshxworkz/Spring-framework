package com.xworkz.web.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 6,urlPatterns = "/GreenColor")
public class GreenServlet extends HttpServlet  {
	
	public GreenServlet() {
		System.out.println("Creating GreenServlet.....");
	}
	
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	System.out.println("running service is Moonservlet");
	resp.setContentType("text/html");
	PrintWriter writer = resp.getWriter();
	writer.append("<html> <head> <body bgcolor='Green'> <h1 style='color:black;'>"+"Idu Green").append("</h1></body></head></html>");
	}

}
