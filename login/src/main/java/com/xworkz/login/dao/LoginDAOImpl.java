package com.xworkz.login.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.login.dto.LoginDTO;

@Repository
public class LoginDAOImpl implements LoginDAO {

	@Autowired
	private EntityManagerFactory factory;
	
	@Override
	public Boolean save(LoginDTO loginDTO) {
		System.out.println("created "+this.getClass().getSimpleName());
		EntityManager manager = factory.createEntityManager();
		try {
			EntityTransaction transaction = manager.getTransaction();
			transaction.begin();
			manager.persist(loginDTO);
			transaction.commit();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			manager.close();
		}
		
		
		
		return null;
	}

}
