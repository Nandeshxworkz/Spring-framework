package com.xworkz.milk_shop.configuration;

import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class FrontControllerConfiguration extends AbstractAnnotationConfigDispatcherServletInitializer
		implements WebMvcConfigurer {

	private String[] servletMappings = {"/"};

	private Class[] servletConfigClasses = { SpringConfiguration.class };

	@Override
	protected Class<?>[] getRootConfigClasses() {

		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {

		return servletConfigClasses;
	}

	@Override
	protected String[] getServletMappings() {

		return servletMappings;
	}

	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		configurer.enable();
	}

}
