package com.xworkz.televisions;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Television1Runner {
	
	
	public static void main(String[] args) {
	
	    ApplicationContext container = new ClassPathXmlApplicationContext("configure.xml");
	    System.out.println(container);
	    Television1 bean = container.getBean(Television1.class);
	    System.out.println(bean);
	}

}
