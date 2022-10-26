package com.xworkz.web.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 5,urlPatterns = "/BlackColor")
public class BlackServlet extends HttpServlet {
	
	public BlackServlet() {
		System.out.println("Creating blackservlet.....!");
	}
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		System.out.println("service running in blackservlet...");
		resp.setContentType("text/html");
		PrintWriter writer = resp.getWriter();
		writer.append("<html> <head> <body bgcolor='black'><h1 style='color:white;'>"+"idu Black").append("</h1></body></head></html>");
	}

}
