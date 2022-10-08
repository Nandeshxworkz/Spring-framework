package com.xworkz.nirmala.service;

import java.util.List;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.nirmala.Entity.NirmalaEntity;
import com.xworkz.nirmala.dao.NirmalaDAO;
import com.xworkz.nirmala.dao.NirmalaDAOImpl;
import com.xworkz.nirmala.util.Factory;

@Component
public class ServiceDAOImpl implements ServiceDAO {

	@Autowired
	NirmalaDAO dao = new NirmalaDAOImpl();
	 ValidatorFactory factory = Factory.getFactory();
	
	public boolean save(NirmalaEntity entity) {
		Validator validator = factory.getValidator();
		Set<ConstraintViolation<NirmalaEntity>> validate = validator.validate(entity);
	    if(validate.size()<0) {
	    	System.out.println("invalid details");
	    }else {
	    	System.out.println("validate details");
	    	dao.save(entity);
	    }
		return false;
	}

}
