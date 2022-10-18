package com.xworkz.milk_shop.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.milk_shop.dto.MilkShopDTO;


@Repository
public class MilkShopDAOImpl implements MilkShopDAO{

	
	@Autowired
	private EntityManagerFactory factory;
	
	
	@Override
	public Boolean save(MilkShopDTO milkShopDTO) {
		System.out.println("Created "+ this.getClass().getSimpleName());
		EntityManager createEntityManager = factory.createEntityManager();
		
		try {
			EntityTransaction transaction = createEntityManager.getTransaction();
			transaction.begin();
			createEntityManager.persist(milkShopDTO);
			transaction.commit();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			createEntityManager.close();
		}
		return true;
	}

}
