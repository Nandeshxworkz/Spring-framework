package com.xworkz.login.configuration;

import java.util.HashMap;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;

@Configuration
public class DBConfiguration {

	@Bean
	public LocalContainerEntityManagerFactoryBean entityManager(DataSource dataSource) {

		LocalContainerEntityManagerFactoryBean factory =new LocalContainerEntityManagerFactoryBean();
	    factory.setPackagesToScan("com.xworkz");
	    factory.setJpaVendorAdapter(new HibernateJpaVendorAdapter());
	    System.out.println("Getting data source from spring ");
	    
	    factory.setDataSource(dataSource);
		
		  Map<String, Object> jpaProperties = new HashMap<String , Object>();
		    jpaProperties.put("hibernate.show_sql", true);
		    factory.setDataSource(dataSource);
		    factory.setJpaPropertyMap(jpaProperties);
		    return factory;
	
	}
	
	@Bean
	public DataSource dataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		 dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		   dataSource.setUrl("jdbc:mysql://localhost:3306/milkshop");
		   dataSource.setPassword("Nandesh@1234");
		   dataSource.setUsername("root");
		   return dataSource;
		
	}
}
