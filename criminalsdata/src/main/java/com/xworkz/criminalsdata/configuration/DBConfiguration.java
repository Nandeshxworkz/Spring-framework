package com.xworkz.criminalsdata.configuration;

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
			LocalContainerEntityManagerFactoryBean factoryBean = new LocalContainerEntityManagerFactoryBean();
		    factoryBean.setPackagesToScan("com.xworkz");
		    factoryBean.setJpaVendorAdapter(new HibernateJpaVendorAdapter());
		    System.out.println("Getting data source from spring ");
		    
		   Map<String, Object> jpaProperties = new HashMap<String , Object>();
		    jpaProperties.put("hibernate.show_sql", true);
		    factoryBean.setDataSource(dataSource);
		    factoryBean.setJpaPropertyMap(jpaProperties);
		    return factoryBean;
	   }
	   
	   @Bean
	   public DataSource dataSource() {
		   DriverManagerDataSource dataSource = new DriverManagerDataSource();
		   dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		   dataSource.setUrl("jdbc:mysql://localhost:3306/criminal");
		   dataSource.setPassword("Nandesh@1234");
		   dataSource.setUsername("root");
		   return dataSource;
		   
	   }
}
