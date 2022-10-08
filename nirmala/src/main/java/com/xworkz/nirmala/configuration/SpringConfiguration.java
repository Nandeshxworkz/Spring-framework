package com.xworkz.nirmala.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;

@Configuration

@ComponentScan(basePackages = "com.xworkz.nirmala")
public class SpringConfiguration {
	
	@Bean
   public	LocalContainerEntityManagerFactoryBean FactoryBean() {
		System.out.println("created SpringConfiguration bean");
	    LocalContainerEntityManagerFactoryBean context = new	LocalContainerEntityManagerFactoryBean();
		context.setJpaVendorAdapter(new HibernateJpaVendorAdapter());
		return context;
	}

}
