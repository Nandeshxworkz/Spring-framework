package com.xworkz.television.configure;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;



@Configuration
@ComponentScan(basePackages="com.xworkz.televisions")
public class BeanConfigurer {	
	
	      @Bean
	      public PropertySourcesPlaceholderConfigurer createBean() {
		  System.out.println("Invoked craeteBean");
		  PropertySourcesPlaceholderConfigurer configurer = new PropertySourcesPlaceholderConfigurer();
		  Resource resource = new ClassPathResource("television.properties");
		  configurer.setLocation(resource);
		  return configurer;		
	} 
}
