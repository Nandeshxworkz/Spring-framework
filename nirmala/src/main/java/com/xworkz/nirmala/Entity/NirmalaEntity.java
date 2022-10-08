package com.xworkz.nirmala.Entity;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.GenericGenerator;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.ToString;


@Data
@Entity
@ToString(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@Table(name="nirmala_info")
public class NirmalaEntity extends ParentEntity {
	
	@Id
	@GenericGenerator(name="auto", strategy = "increment")
	@GeneratedValue(generator = "auto")
	
	
	@Min(value=1,message = "id is greaterthan zero")
	private int id;
	@NotNull
	private String location;
	@NotNull
	private  String gender;
	@NotNull
	private String type;
	@Min(value = 4)
	@Max(value = 10)
	private double price;
	@NotNull
	private LocalTime duration;
	
	
	public NirmalaEntity(String location, String gender, String type, double price, LocalTime duration,String createdBy, LocalDate createdDate, String updatedBy, LocalDate updatedDate) {
		super(createdBy, createdDate, updatedBy, updatedDate);
		
		this.location = location;
		this.gender = gender;
		this.type = type;
		this.price = price;
		this.duration = duration;
	}
	
	

}
