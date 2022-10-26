package com.xworkz.metro.runner;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.metro.dao.MetroDAO;
import com.xworkz.metro.dao.MetroDAOImpl;
import com.xworkz.metro.entity.MetroEntity;

public class MetroRunner {

	public static void main(String[] args) {

		MetroEntity entity = new MetroEntity("Namm", 12387, "Green", 10, "SilkCity", "Nagasandra");
		MetroEntity entity1 = new MetroEntity("Namm metro", 2412387, "purple", 8, "kengeri", "Baipanahalli");
		MetroEntity entity2 = new MetroEntity("Namm metro", 12387, "Yellow", 7, "Btm", "whitefield");

		MetroDAO dao = new MetroDAOImpl();

		List<MetroEntity> list = new ArrayList<MetroEntity>();
		list.add(entity);
		list.add(entity1);
		list.add(entity2);
		boolean save = dao.save(list);
		System.out.println("data saving :"+ save);
	}

}
