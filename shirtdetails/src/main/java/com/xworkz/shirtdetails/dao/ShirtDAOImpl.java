package com.xworkz.shirtdetails.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.shirtdetails.dto.ShirtDTO;

@Repository
public class ShirtDAOImpl implements ShirtDAO {
	
	@Autowired
	private EntityManagerFactory factory;

	@Override
	public Boolean save(ShirtDTO shirtDTO) {
		System.out.println("created"+this.getClass().getSimpleName());
		
	EntityManager manager = factory.createEntityManager();
	try {
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		manager.persist(shirtDTO);
		transaction.commit();
	}catch(Exception e) {
		e.printStackTrace();
	}finally {
		manager.close();
	}
		
		
		
		
		return true;
	}

}
