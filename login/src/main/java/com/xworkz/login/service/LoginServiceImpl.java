package com.xworkz.login.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.login.dao.LoginDAO;
import com.xworkz.login.dto.LoginDTO;

@Service
public class LoginServiceImpl implements LoginService{

	@Autowired
	private LoginDAO loginDAO;
	
	
	@Override
	public Boolean save(LoginDTO loginDTO) {
		
		loginDAO.save(loginDTO);
		return true;
	}

}
