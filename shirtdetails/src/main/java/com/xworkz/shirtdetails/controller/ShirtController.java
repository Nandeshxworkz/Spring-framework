package com.xworkz.shirtdetails.controller;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.xworkz.shirtdetails.dto.ShirtDTO;
import com.xworkz.shirtdetails.service.ShirtService;



@Controller
@RequestMapping("/shirt")
public class ShirtController {

	@Autowired
	private ShirtService service;
	
	@PostMapping
	public String onSend(ShirtDTO shirt,Model model,@RequestParam("image") MultipartFile file) throws IOException {
		System.out.println("Calling onSend Method");
		byte[] bytes = file.getBytes();
        Path path = Paths.get("D:/temp-files/" + file.getOriginalFilename());
        Files.write(path, bytes);
		Boolean save = service.save(shirt);
		if(save) {
			System.out.println("Data Entered Are Vallid");
			model.addAttribute("Mesg", "Record Save, Click to enter Next Criminal Detail");
			return "index";
		}
		else {
			System.out.println("Data Entered Are not Valid");
		return "index";
		}
	}
	
	
	@GetMapping
	public String readAll(Model model) {
		System.out.println("Calling readAll Method");
		List<ShirtDTO> shirtDTO = service.findAll();
		if(shirtDTO!=null & !shirtDTO.isEmpty()) {
			System.out.println("The records are found"+shirtDTO);
			model.addAttribute("ShirtDetails", shirtDTO);
			model.addAttribute("RecordCount",  "No of records  "+  shirtDTO.size());
		}
		return "Display";
	}
	
	@GetMapping("/findBybrand")
	public String readByBrand(HttpServletRequest req,Model model ) {
		String parameter = req.getParameter("brand");
		List<ShirtDTO> findByBrand = service.findByBrand(parameter);
		if(findByBrand!=null & !findByBrand.isEmpty()) {
			model.addAttribute("ShirtDetails", findByBrand);
			model.addAttribute("RecordCount",  "No of records  "+  findByBrand.size());
		
		}
		return "Display";
	}


	
}
