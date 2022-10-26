package com.xworkz.televisions;

import org.springframework.stereotype.Component;

@Component
public class Television1 {
	
	private String brand;
	private double price;
	
	public Television1() {
		System.out.println(this.getClass().getSimpleName()+" bean is created");
	}

	public Television1(String brand, double price) {
		this.brand = brand;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Television1 [brand=" + brand + ", price=" + price + "]";
	}

}
