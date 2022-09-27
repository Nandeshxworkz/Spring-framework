package com.xworkz.job.servlet.dto;

public class JobDTO {
	
	private String name;
	private String email;
	private Long phoneNo;
	private String altPhNr;
	private String gender;
	private String qualification;
	private String yop;
	private String university;
	private String address;
	private String skills;
	private String ctc;
	private String experience;
	private String idProof;
	private String idProofNum;

	public JobDTO() {
		System.out.println("JOB DTO Created");
	}

	public JobDTO(String name, String email, Long phoneNo, String altPhNr, String gender, String qualification,
			String yop, String university, String address, String skills, String ctc, String experience, String idProof,
			String idProofNum) {
		super();
		this.name = name;
		this.email = email;
		this.phoneNo = phoneNo;
		this.altPhNr = altPhNr;
		this.gender = gender;
		this.qualification = qualification;
		this.yop = yop;
		this.university = university;
		this.address = address;
		this.skills = skills;
		this.ctc = ctc;
		this.experience = experience;
		this.idProof = idProof;
		this.idProofNum = idProofNum;
	}

	@Override
	public String toString() {
		return "JobDTO [name=" + name + ", email=" + email + ", phoneNo=" + phoneNo + ", altPhNr=" + altPhNr
				+ ", gender=" + gender + ", qualification=" + qualification + ", yop=" + yop + ", university="
				+ university + ", address=" + address + ", skills=" + skills + ", ctc=" + ctc + ", experience="
				+ experience + ", idProof=" + idProof + ", idProofNum=" + idProofNum + "]";
	}

}
