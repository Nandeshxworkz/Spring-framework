package com.xworkz.milk_shop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.milk_shop.dao.MilkShopDAO;
import com.xworkz.milk_shop.dto.MilkShopDTO;

@Service
public class MilkShopServiceImpl implements MilkShopService{
	
	@Autowired
	private MilkShopDAO shopDAO;

	@Override
	public Boolean validateAndSave(MilkShopDTO milkShopDTO) {
       System.out.println("creatde "+ this.getClass().getSimpleName());
       shopDAO.save(milkShopDTO);
		return true;
	}

}
