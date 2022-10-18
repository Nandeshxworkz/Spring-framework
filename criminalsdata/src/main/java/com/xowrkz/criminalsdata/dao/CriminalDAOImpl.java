package com.xowrkz.criminalsdata.dao;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceException;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.criminalsdata.dto.CriminalDTO;


@Repository
public class CriminalDAOImpl implements CriminalDAO {

	
	@Autowired(required = true)
	private EntityManagerFactory factory;
	EntityManager manager= null;
	
	public CriminalDAOImpl() {
		System.out.println("Calling Default Constructor of:"+this.getClass().getSimpleName());
	}
	

	
	
	@Override
	public void save(CriminalDTO criminal) {
		
		try {
			  manager = factory.createEntityManager();
			  EntityTransaction transaction = manager.getTransaction();
			  transaction.begin();
			  manager.persist(criminal);
			  transaction.commit();
			
		}
		catch(PersistenceException p) {
			p.printStackTrace();
		}
		finally {
			manager.close();
		}

	}@Override
	public List<CriminalDTO> findAll() {
		
		try {
			manager = factory.createEntityManager();
			Query query = manager.createNamedQuery("findAll");
			List<CriminalDTO> criminal = query.getResultList();
			if(criminal != null)
				return criminal;
		}
		catch(PersistenceException p) {
			p.printStackTrace();
		}
		finally {
			manager.close();
		}
		
		return null;
	}

}	
