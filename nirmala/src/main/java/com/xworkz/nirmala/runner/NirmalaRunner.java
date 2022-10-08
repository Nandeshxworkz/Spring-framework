package com.xworkz.nirmala.runner;

import java.time.LocalDate;
import java.time.LocalTime;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.nirmala.Entity.NirmalaEntity;
import com.xworkz.nirmala.configuration.SpringConfiguration;
import com.xworkz.nirmala.service.ServiceDAO;
import com.xworkz.nirmala.service.ServiceDAOImpl;

public class NirmalaRunner {

	public static void main(String[] args) {

	
	 ApplicationContext container = new AnnotationConfigApplicationContext(SpringConfiguration.class);
	 System.out.println(container);
		
		NirmalaEntity entity = new NirmalaEntity("Bengalore", "Male", "Private", 6, LocalTime.now(), "chetta",
				LocalDate.now(), "Bablya", LocalDate.now());

		ServiceDAO dao = new ServiceDAOImpl();
		dao.save(entity);
		
    }
}