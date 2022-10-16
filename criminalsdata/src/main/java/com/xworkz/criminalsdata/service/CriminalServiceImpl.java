package com.xworkz.criminalsdata.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xowrkz.criminalsdata.dao.CriminalDAO;
import com.xworkz.criminalsdata.dto.CriminalDTO;

@Service
public class CriminalServiceImpl implements CriminalService{

	@Autowired
	private CriminalDAO criminalDAO;
	
	
	@Override
	public Boolean save(CriminalDTO criminalDTO) {
		criminalDAO.save(criminalDTO);
		return true;
	}

}
