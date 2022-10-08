package com.xworkz.songsandfood.dto;

public class FoodDTO {
	
	private String foodName;
	private Double price;
	private String hotelName;
	private String type;
	private String location;
	private String ordered;
	private String quantity;
	@Override
	public String toString() {
		return "FoodDTO [foodName=" + foodName + ", price=" + price + ", hotelName=" + hotelName + ", type=" + type
				+ ", location=" + location + ", ordered=" + ordered + ", quantity=" + quantity + "]";
	}
	public String getFoodName() {
		return foodName;
	}
	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getHotelName() {
		return hotelName;
	}
	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getOrdered() {
		return ordered;
	}
	public void setOrdered(String ordered) {
		this.ordered = ordered;
	}
	public String getQuantity() {
		return quantity;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
	
	

}
