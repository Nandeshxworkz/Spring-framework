package com.xworkz.nirmala.dao;



import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.nirmala.Entity.NirmalaEntity;


@Component
public class NirmalaDAOImpl implements NirmalaDAO{
	
	
	
	@Autowired
	EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.xworkz");

	
	public boolean save(NirmalaEntity entity) {
		try {
			EntityManager manager = factory.createEntityManager();
			EntityTransaction tx = manager.getTransaction();
			tx.begin();
		    manager.persist(entity);
			tx.commit();
			
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			
		}
		
		return false;
	}

}
