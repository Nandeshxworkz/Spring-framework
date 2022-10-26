package com.xworkz.login.controller;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.xworkz.login.dto.LoginDTO;
import com.xworkz.login.service.LoginService;

@Controller
@RequestMapping("/login")
public class LoginController {
	
	@Autowired 
	private LoginService service;
	
	@PostMapping
	public String onSave(LoginDTO loginDTO,Model model, @RequestParam("image") MultipartFile file) throws IOException{
		System.out.println("Calling onSave Method");
		byte[] bytes = file.getBytes();
		Path path = Paths.get("D:/temp-files/" +System.currentTimeMillis() +"_" + file.getOriginalFilename());
		Files.write(path, bytes);
		Boolean save = service.save(loginDTO);
		if(save) {
			System.out.println("Data Entered Are Valid");
			model.addAttribute("Mesg", "Record Save, Click to enter Next Detail");
			return "index";
		}else {
			System.out.println("Data entered is not valid");
			return "index";
		}
		
		
	}

}
