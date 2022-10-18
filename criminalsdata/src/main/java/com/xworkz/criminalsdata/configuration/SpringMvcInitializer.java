package com.xworkz.criminalsdata.configuration;

import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;


public class SpringMVCInitializer extends AbstractAnnotationConfigDispatcherServletInitializer implements WebMvcConfigurer {

	private String[] serveletMappings = {"/"};
	private Class[] servletConfigClasses = {SpringConfiguration.class,DBConfiguration.class};
	
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

}
