package com.xworkz.televisions;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Television {
	
	@Value("${brand}")
	private String brand;
	@Value("${price}")
	private double price;
	

	public Television() {
		System.out.println(this.getClass().getSimpleName()+" bean is created");
	}


	public Television(String brand, double price) {
		super();
		this.brand = brand;
		this.price = price;
	}


	public String getBrand() {
		return brand;
	}


	public void setBrand(String brand) {
		this.brand = brand;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}
	
	

}