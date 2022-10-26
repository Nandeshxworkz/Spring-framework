package com.xworkz.shirtdetails.configuration;

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
			System.out.println("Creatig file upload customizer");
			// upload temp file will put here
			File uploadDirectory = new File("D:/temp-files");

			// register a MultipartConfigElement
			MultipartConfigElement multipartConfigElement = new MultipartConfigElement(uploadDirectory.getAbsolutePath(),
					100000, 100000 * 2, 100000/ 2);

			registration.setMultipartConfig(multipartConfigElement);

		
	}

}
