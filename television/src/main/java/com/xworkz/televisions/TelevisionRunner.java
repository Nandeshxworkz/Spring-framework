package com.xworkz.televisions;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.television.configure.BeanConfigurer;

public class TelevisionRunner {

	public static void main(String[] args) {
     
	ApplicationContext container = new AnnotationConfigApplicationContext(BeanConfigurer.class);
	System.out.println(container);
    Television bean1 = container.getBean(Television.class);
    String string = bean1.toString();
    System.out.println(string);
	}

}
