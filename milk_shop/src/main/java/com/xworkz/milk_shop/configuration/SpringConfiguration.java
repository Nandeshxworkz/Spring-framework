package com.xworkz.milk_shop.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan(basePackages = "com.xworkz")
public class SpringConfiguration {

	@Bean
	public ViewResolver resolver() {
		System.out.println("Calling resolver ");
		return new InternalResourceViewResolver("/", ".jsp");
	}

}
