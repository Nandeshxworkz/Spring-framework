package com.xworkz.football;

public class FootBall {
	
	private String brand;
	private Double price;
	
	private AirFilled airfilled;
	
	
	
	public FootBall(AirFilled airfilled) {
		
		this.airfilled = airfilled;
	}




	public FootBall() {
		System.out.println(this.getClass().getSimpleName()+"football bean is created");
	}
	
	
      

	public FootBall(String brand, Double price) {
		this.brand = brand;
		this.price = price;
	}




	public String getBrand() {
		return brand;
	}


	public void setBrand(String brand) {
		this.brand = brand;
	}


	public Double getPrice() {
		return price;
	}


	public void setPrice(Double price) {
		this.price = price;
	}




	@Override
	public String toString() {
		return "FootBall [brand=" + brand + ", price=" + price + ", airfilled=" + airfilled + "]";
	}



	
	

}
