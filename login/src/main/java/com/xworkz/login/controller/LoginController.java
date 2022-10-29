package com.xworkz.login.controller;

import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.net.URLConnection;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.xworkz.login.dto.LoginDTO;
import com.xworkz.login.service.LoginService;

@MultipartConfig
@Controller
@RequestMapping("/login")
public class LoginController {
	
	@Autowired 
	private LoginService service;
	
	@PostMapping
	public String onSave(LoginDTO loginDTO,Model model, @RequestParam("image") MultipartFile file) throws IOException{
		System.out.println("Calling onSave Method");
		byte[] bytes = file.getBytes();
		String string=System.currentTimeMillis()+"_"+file.getOriginalFilename();
		Path path = Paths.get("D:/temp-files/" +"_" + string);
		Files.write(path, bytes);
		loginDTO.setProfilePicture(string);
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
	
	@GetMapping({"**/image"})
	public void sendImage(@RequestParam String fileName, HttpServletResponse response) throws IOException {
		System.out.println("running sendFile..." + fileName);
		File file = new File("D://temp-files//" + fileName);
		String mimeType = URLConnection.guessContentTypeFromName(file.getName());
		response.setContentType(mimeType);
		try (OutputStream stream = response.getOutputStream()) {
			stream.write(Files.readAllBytes(file.toPath()));
		}
	}
	

}
