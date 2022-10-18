package com.xworkz.milk_shop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.milk_shop.dto.MilkShopDTO;
import com.xworkz.milk_shop.service.MilkShopService;

@Controller
@RequestMapping("/milk")
public class MilkShopController {
	
	@Autowired
	private MilkShopService service;
	
	@PostMapping
	public String onSave(MilkShopDTO milkShopDTO) {
		System.out.println("calling on save method ");
		System.out.println("MilkshopDTO :"+ milkShopDTO);
		Boolean validateAndSave = service.validateAndSave(milkShopDTO);
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
