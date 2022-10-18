package com.xworkz.shirtdetails.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.shirtdetails.dto.ShirtDTO;
import com.xworkz.shirtdetails.service.ShirtService;



@Controller
@RequestMapping("/shirt")
public class ShirtController {

	@Autowired
	private ShirtService service;
	
	@PostMapping
	public String onSave(ShirtDTO shirtDTO, Model model) {
		System.out.println("calling on save method ");
		System.out.println("MilkshopDTO :"+ shirtDTO);
		Boolean validateAndSave = service.save(shirtDTO);
		System.out.println(validateAndSave);
		if(validateAndSave) {
			System.out.println("Data  validate and saved....");
			model.addAttribute("Mesg", validateAndSave);
			return "index";
		}else {
			System.out.println("Data is not valid and Saved...");
		}
		
		return "index";
	}

	
}
