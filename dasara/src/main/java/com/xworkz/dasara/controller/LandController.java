package com.xworkz.dasara.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/")
public class LandController {
	
	public LandController() {
		System.out.println("running "+this.getClass().getSimpleName());
	}
	
	@RequestMapping("/create.do")
	public String onClick(){
		System.out.println("On click running");
		return "index.jsp";
	}

}
