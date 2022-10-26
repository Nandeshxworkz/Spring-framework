package com.xworkz.shirtdetails.service;

import java.util.List;

import com.xworkz.shirtdetails.dto.ShirtDTO;

public interface ShirtService {
	
	Boolean save(ShirtDTO shirtDTO);
	
	public List<ShirtDTO> findAll();
	
	
	List<ShirtDTO> findByBrand(String brand);

}
