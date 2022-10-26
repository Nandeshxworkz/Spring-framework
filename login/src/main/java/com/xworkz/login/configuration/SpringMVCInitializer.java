package com.xworkz.login.configuration;

import java.io.File;

import javax.servlet.MultipartConfigElement;
import javax.servlet.ServletRegistration;
import javax.servlet.ServletRegistration.Dynamic;

import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class SpringMVCInitializer extends AbstractAnnotationConfigDispatcherServletInitializer
		implements WebMvcConfigurer {

	private String[] serveletMappings = { "/" };
	private Class[] servletConfigClasses = { SpringConfiguration.class, DBConfiguration.class };

	@Override
	protected Class<?>[] getRootConfigClasses() {
		System.out.println("Created getRootConfigClasses()....");
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		System.out.println("created getServletConfigClasses()....");
		return servletConfigClasses;
	}

	@Override
	protected String[] getServletMappings() {
		System.out.println("created getServletMappings()....");
		return serveletMappings;
	}

	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {

		configurer.enable();
	}

	@Override
	protected void customizeRegistration(ServletRegistration.Dynamic registration) {

		File file = new File("D:/temp-files");
         System.out.println("Getting files from database");
		MultipartConfigElement multipartConfigElement = new MultipartConfigElement(file.getAbsolutePath(), 1000000,
				1000000 * 2, 1000000 / 2);
		registration.setMultipartConfig(multipartConfigElement);

	}

}
