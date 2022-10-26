package com.xworkz.comapny.dto;

public class CompanyDTO {
	
	private String companyName;
	private String companyFounder;
	private String createdAt;
	private String noOfEmployees;
	private String location;
	private String companyType;
	
	public CompanyDTO() {
		System.out.println("Calling Default CompanyDTO Constructor ");
	}

	public CompanyDTO(String companyName, String companyFounder, String createdAt, String noOfEmployees,
			String location, String companyType) {
		super();
		this.companyName = companyName;
		this.companyFounder = companyFounder;
		this.createdAt = createdAt;
		this.noOfEmployees = noOfEmployees;
		this.location = location;
		this.companyType = companyType;
	}

	
	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getCompanyFounder() {
		return companyFounder;
	}

	public void setCompanyFounder(String companyFounder) {
		this.companyFounder = companyFounder;
	}

	public String getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}

	public String getNoOfEmployees() {
		return noOfEmployees;
	}

	public void setNoOfEmployees(String noOfEmployees) {
		this.noOfEmployees = noOfEmployees;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getCompanyType() {
		return companyType;
	}

	public void setCompanyType(String companyType) {
		this.companyType = companyType;
	}

	
	
	
}


