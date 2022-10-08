package com.xworkz.dasara.controller;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.dasara.dto.SuicideDTO;

@Component
@RequestMapping("/")
public class CommittedSuicideController {

	public CommittedSuicideController() {
		System.out.println("created "+ this.getClass().getSimpleName());
	}
	
	@RequestMapping("/Suicide.do")
	public String onCreateSuicideDTO(SuicideDTO dto , Model model) {
		System.out.println("running onCreateSuicideDTO");
		System.out.println("DTO data from form "+ dto);
		model.addAttribute("message", "Data saved successfully");
		model.addAttribute("dto", dto);
		return "CommittedSuicide.jsp";
	}
}
