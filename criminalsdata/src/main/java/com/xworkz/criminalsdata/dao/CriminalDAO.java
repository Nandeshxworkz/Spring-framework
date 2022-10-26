package com.xworkz.criminalsdata.dao;

import java.util.List;

import com.xworkz.criminalsdata.dto.CriminalDTO;


public interface CriminalDAO {

	public void save(CriminalDTO criminal);
	public List<CriminalDTO> findAll();
}
