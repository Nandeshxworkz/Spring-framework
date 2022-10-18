package com.xworkz.criminalsdata.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xowrkz.criminalsdata.dao.CriminalDAO;
import com.xworkz.criminalsdata.dto.CriminalDTO;

@Service
public class CriminalServiceImpl implements CriminalService{

	@Autowired(required = true)
	private CriminalDAO criminalDAO;


	public Boolean validateAndSave(CriminalDTO criminal) {
		System.out.println("Calling ");
//		if(criminal.getCriminalName() != null & criminal.getCriminalAge() != null & criminal.getCriminalType() != null & criminal.getNetWorth() != null) {
		System.out.println("Entered Details Are Valid");
		criminalDAO.save(criminal);
		return true;
	}

	@Override
	public List<CriminalDTO> findAll() {
		System.out.println("Calling FindAll Method Of Service");
		List<CriminalDTO> findAll = criminalDAO.findAll();
		return findAll;
	}

}
