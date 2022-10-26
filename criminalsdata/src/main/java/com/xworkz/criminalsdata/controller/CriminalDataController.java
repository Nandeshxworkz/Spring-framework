package com.xworkz.criminalsdata.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.criminalsdata.dto.CriminalDTO;
import com.xworkz.criminalsdata.service.CriminalService;

@Controller
@RequestMapping("/criminal")
public class CriminalDataController {

	@Autowired(required = true)
	private CriminalService criminalService;
	
	public CriminalDataController() {
		System.out.println("Calling Default Constructor of:"+this.getClass().getSimpleName());
	}
	
	@PostMapping
	public String onSend(CriminalDTO criminalDTO,Model model) {
		System.out.println("Calling onSend Method");
		Boolean save = criminalService.validateAndSave(criminalDTO);
		if(save) {
			System.out.println("Data Entered Are Vallid");
			model.addAttribute("Mesg", "Record Save, Click to enter Next Criminal Detail");
			return "index";
		}
		else {
			System.out.println("Data Entered Are not Valid");
		
		}
		return "index";
	}
	
	@GetMapping
	public String readAll(Model model) {
		System.out.println("Calling readAll Method");
		List<CriminalDTO> crimeDTO = criminalService.findAll();
		if(crimeDTO != null & !crimeDTO.isEmpty()) {
			System.out.println("The records Are Found"+crimeDTO.size());
			model.addAttribute("CriminalDetails", crimeDTO);
			model.addAttribute("RecordCount","No Of Records Found"+crimeDTO.size());
		}
		else {
			System.out.println("No Records Are Found");
		}
		return "Display";
		
	}
}
