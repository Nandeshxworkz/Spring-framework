package com.xworkz.shirtdetails.dao;

import java.util.List;

import com.xworkz.shirtdetails.dto.ShirtDTO;

public interface ShirtDAO {
	
	Boolean save(ShirtDTO shirtDTO);
	
	public List<ShirtDTO> findAll();
	
	List<ShirtDTO> findByBrand(String brand);

}
