package com.xworkz.fire.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(loadOnStartup = 12,urlPatterns = "/switch")
public class FireServlet extends HttpServlet {
	
	public FireServlet() {
		System.out.println("FireServlet created by using default constructor");
	}
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		String parameter = req.getParameter("Alias name");
	    String parameter2 = req.getParameter("company");
		String parameter3 = req.getParameter("salary"); 
		
		System.out.println("Name :"+ parameter);
		System.out.println("company :"+ parameter2);
		System.out.println("salary :"+parameter3);
		
		System.out.println("service running in fireservlet...");
		resp.setContentType("text/html");
		PrintWriter writer = resp.getWriter();
		writer.append("<html>")
		.append("<head>")
		.append("<body >")
		.append("<h1 >" +" this is benki............")
		.append("</h1>")
		.append("Alias name "+parameter+" <br>")
		.append("company "+parameter2+" <br> ") 
		.append("salary "+parameter3)
		.append("</body>")
		.append("</head>")
		.append("</html>");
	}

	}


