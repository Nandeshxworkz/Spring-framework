package com.xworkz.job.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.job.servlet.dto.JobDTO;

@WebServlet(loadOnStartup = 3,urlPatterns = "/job")
public class JobServlet extends HttpServlet {
	
	List<JobDTO> dto = new ArrayList<JobDTO>();
	
	public JobServlet() {
		System.out.println("Created default constructor Jobservlet.......");
	}
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		
			System.out.println("Calling metod service ");
			String name = req.getParameter("aName");
			String email = req.getParameter("email");
			String num = req.getParameter("phNumber");
			String altNum = req.getParameter("AphNumber");
			String gender = req.getParameter("gender");
			String education = req.getParameter("edu");
			String yop = req.getParameter("year");
			String eBoard = req.getParameter("board");
			String adress = req.getParameter("location");
			String skill = req.getParameter(name);
			String ctc = req.getParameter("package");
			String experience = req.getParameter("exp");
			String idName = req.getParameter("id");
			String idNum = req.getParameter("idn");
			System.out.println(name + email + num + altNum + gender + education + yop + eBoard + adress + skill + ctc
					+ experience + idName + idNum);
			
			resp.setContentType("text/html");
			PrintWriter writer = resp.getWriter();
			writer.append("<html>")
			.append("<head>")
			.append("<body >")
			.append("<h1 >" +" ..............Registration success............")
			.append("</h1>")
			.append(" Name :"+name+" <br>")
			.append(" Email :"+email+" <br>")
			.append(" Phone_no :"+num+" <br>")
			.append(" Alternative Phone_no :"+altNum+" <br>")
			.append(" Gender :"+gender+" <br>")
			.append(" Qualification :"+education+" <br>")
			.append(" PassOut Year :"+yop+" <br>")
			.append(" University  :"+eBoard+" <br>")
			.append(" Address :"+adress+" <br>")
			.append(" skill :"+skill+" <br>")
			.append(" Expected CTC :"+ctc+" <br>")
			.append(" Experience :"+experience+" <br>")
			.append(" Id Proof  :"+idName+" <br>")
			.append("Proof Number :"+idNum+ "<br>" )
			.append("</body>")
			.append("</head>")
			.append("</html>");
			
			JobDTO dtos = new JobDTO(name, email, Long.parseLong(num), altNum, gender, education, yop, eBoard, adress, skill, ctc, experience, idName, idNum);
			System.out.println(dto.add(dtos));
	}

}
