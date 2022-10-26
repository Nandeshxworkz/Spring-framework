package com.xworkz.shirtdetails.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.shirtdetails.dto.ShirtDTO;

@Repository
public class ShirtDAOImpl implements ShirtDAO {

	@Autowired
	private EntityManagerFactory factory;

	@Override
	public Boolean save(ShirtDTO shirtDTO) {
		System.out.println("created" + this.getClass().getSimpleName());

		EntityManager manager = factory.createEntityManager();
		try {
			EntityTransaction transaction = manager.getTransaction();
			transaction.begin();
			manager.persist(shirtDTO);
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			manager.close();
		}
		return true;
	}

	@Override
	public List<ShirtDTO> findAll() {

		try {
			EntityManager manager = factory.createEntityManager();
			Query query = manager.createNamedQuery("findAll");
            List<ShirtDTO> shirt = query.getResultList();
            if(shirt!=null)
            	return shirt;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {

		}

		return null;
	}
	
	
	@Override
	public List<ShirtDTO> findByBrand(String brand) {
		EntityManager manager = factory.createEntityManager();
		try {
			Query query = manager.createNamedQuery("findByBrand");
			query.setParameter("br", brand);
			List<ShirtDTO> resultList = query.getResultList();
			if(resultList!=null) {
				return resultList;
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			manager.close();
		}
		
		return null;
	}

}
