package com.xworkz.shirtdetails.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.shirtdetails.dao.ShirtDAO;
import com.xworkz.shirtdetails.dto.ShirtDTO;

@Service
public class ShirtServiceImpl implements ShirtService{

	@Autowired
	private ShirtDAO shirtDAO;
	
	@Override
	public Boolean save(ShirtDTO shirtDTO) {
		 shirtDAO.save(shirtDTO);
		return true;
	}
	
	@Override
	public List<ShirtDTO> findAll() {
		List<ShirtDTO> findAll = shirtDAO.findAll();
		return findAll;
	}

	@Override
	public List<ShirtDTO> findByBrand(String brand) {
		List<ShirtDTO> findByBrand = shirtDAO.findByBrand(brand);
         return shirtDAO.findByBrand(brand);
				 
	}

}
