package com.xworkz.metro.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.xworkz.metro.entity.MetroEntity;
import com.xworkz.metro.util.Factory;

public class MetroDAOImpl implements MetroDAO {

	EntityManagerFactory factory = Factory.getFactory();
			public boolean save(List<MetroEntity> entity) {
				
				try {
					  
					  EntityManager manager = factory.createEntityManager();
					  EntityTransaction tx = manager.getTransaction();
					  tx.begin();
					  for (MetroEntity metroEntity : entity) {
						  manager.persist(metroEntity);
						  System.out.println(metroEntity);
						 
					}
					  
					  tx.commit();
					
				}catch(Exception e){
					e.printStackTrace();
				}
				
		return true;
	}

}
