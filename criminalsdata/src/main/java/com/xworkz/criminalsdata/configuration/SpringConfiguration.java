package com.xworkz.criminalsdata.configuration;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan(basePackages = "com.xworkz.criminalsdata")
public class SpringConfiguration {

	public SpringConfiguration() {
		
		System.out.println("Calling Default Constructor of:"+this.getClass().getSimpleName());
	}
	
	@Bean
	public ViewResolver viewResolver() {
		System.out.println("Calling ViewResolver Method" );
		return new InternalResourceViewResolver("/",".jsp");
	}
}
