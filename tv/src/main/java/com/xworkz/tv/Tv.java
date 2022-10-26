package com.xworkz.tv;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


//@Component

public class Tv {
	//@Value("${ppName}")
	private String name;
	@Value("Sonyy")
	private	String brand;
	@Value("${xworkz}")
	private double price;
	@Autowired
	private TvDisplay display;
	@Autowired
	private TvRemote remote;
	@Autowired
	private TvSetupbox box;
	@Autowired
	private TvStand stand;
	
	public Tv() {
		System.out.println(this.getClass().getSimpleName()+" bean is created  ");
	}
	

	
	
	public Tv(String name, String brand, double price, TvDisplay display, TvRemote remote, TvSetupbox box,
			TvStand stand) {
		
		this.name = name;
		this.brand = brand;
		this.price = price;
		this.display = display;
		this.remote = remote;
		this.box = box;
		this.stand = stand;
	}
 	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	public TvDisplay getDisplay() {
		return display;
	}
	public void setDisplay(TvDisplay display) {
		this.display = display;
	}
	public TvRemote getRemote() {
		return remote;
	}
	public void setRemote(TvRemote remote) {
		this.remote = remote;
	} 
	public TvSetupbox getBox() {
		return box;
	}
	public void setBox(TvSetupbox box) {
		this.box = box;
	}
    public TvStand getStand() {
		return stand;
	}
	public void setStand(TvStand stand) {
		this.stand = stand;
	}

	@Override
	public String toString() {
		return "Tv [name=" + name + ", brand=" + brand + ", price=" + price + ", display=" + display + ", remote="
				+ remote + ", box=" + box + ", stand=" + stand + "]";
	}

	}
	
	
	
	
