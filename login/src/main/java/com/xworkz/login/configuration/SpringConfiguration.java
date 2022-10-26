package com.xworkz.login.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.multipart.MultipartResolver;
import org.springframework.web.multipart.support.StandardServletMultipartResolver;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan(basePackages = "com.xworkz")
public class SpringConfiguration {

	public SpringConfiguration() {
		System.out.println("Running Spring Configuration");
	}

	@Bean
	public ViewResolver resolver() {
		System.out.println("Calling Resolver");
		return new InternalResourceViewResolver("/", ".jsp");

	}
	
  public MultipartResolver multipartResolver() {
		System.out.println("Calling View Resolver");
	  return new StandardServletMultipartResolver();
		
	}

}
