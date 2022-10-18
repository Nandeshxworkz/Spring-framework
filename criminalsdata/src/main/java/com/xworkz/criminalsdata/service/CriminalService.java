package com.xworkz.criminalsdata.service;

import java.util.*;

import com.xworkz.criminalsdata.dto.CriminalDTO;

public interface CriminalService {

	public Boolean validateAndSave(CriminalDTO criminal);
	public List<CriminalDTO> findAll();
}
