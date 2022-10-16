package com.xworkz.criminalsdata.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.criminalsdata.dto.CriminalDTO;
import com.xworkz.criminalsdata.service.CriminalService;

@Controller
@RequestMapping("/criminal")
public class CriminalController {

	
	@Autowired
	private CriminalService service;
	
	@PostMapping
	public String onSave(CriminalDTO criminalDTO) {
		System.out.println("calling on save method ");
		System.out.println("CriminalDTO :"+ criminalDTO);
		Boolean validateAndSave = service.save(criminalDTO);
		System.out.println(validateAndSave);
		if(validateAndSave) {
			System.out.println("Data  validate and saved....");
			return "Display";
		}else {
			System.out.println("Data is not valid and Saved...");
		}
		
		return "index";
	}

}
