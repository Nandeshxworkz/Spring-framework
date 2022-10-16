package com.xowrkz.criminalsdata.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.criminalsdata.dto.CriminalDTO;

@Repository
public class CriminalDAOImpl implements CriminalDAO {

	@Autowired
	private EntityManagerFactory factory;
	
	@Override
	public Boolean save(CriminalDTO criminalDTO) {
		System.out.println("created "+this.getClass().getSimpleName());
		
		
		EntityManager manager = factory.createEntityManager();
		try {
			EntityTransaction transaction = manager.getTransaction();
			transaction.begin();
			manager.persist(criminalDTO);
			transaction.commit();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			manager.close();
		}
		
		return true;
	}

}
