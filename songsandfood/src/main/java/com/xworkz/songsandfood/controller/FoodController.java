package com.xworkz.songsandfood.controller;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.songsandfood.dto.FoodDTO;

@Component
@RequestMapping("/")
public class FoodController {

	Collection<FoodDTO> foods = new ArrayList<FoodDTO>();

	public FoodController() {
		System.out.println("created " + this.getClass().getSimpleName());

	}

	@RequestMapping("/foood.do")
	public String onCreatedFoodDTO(FoodDTO food, Model model) {
		System.out.println("Running onCreatedFoodDTO");
		foods.add(food);
		model.addAttribute("FoodDTO ", food);
		return "food.jsp";
	}

	@RequestMapping("/foodview.do")
	public String OnViews(Model model) {
		System.out.println("running onview()...");
        model.addAttribute("list",this.foods);
        return "foodDisp.jsp";
	}
}
