package com.xworkz.dasara.dto;

public class SuicideDTO {

	private String name;
	private int age;
	private String Gender;
	private String reason;
	private String attempts;
	private String spot;
	private String dataeandtime;
	private String type;
	@Override
	public String toString() {
		return "SuicideDTO [name=" + name + ", age=" + age + ", Gender=" + Gender + ", reason=" + reason + ", attempts="
				+ attempts + ", spot=" + spot + ", dataeandtime=" + dataeandtime + ", type=" + type + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	public String getAttempts() {
		return attempts;
	}
	public void setAttempts(String attempts) {
		this.attempts = attempts;
	}
	public String getSpot() {
		return spot;
	}
	public void setSpot(String spot) {
		this.spot = spot;
	}
	public String getDataeandtime() {
		return dataeandtime;
	}
	public void setDataeandtime(String dataeandtime) {
		this.dataeandtime = dataeandtime;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	
}
