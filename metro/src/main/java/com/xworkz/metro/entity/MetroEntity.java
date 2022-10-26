package com.xworkz.metro.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter

@NoArgsConstructor
@ToString
@Entity
@Table(name="metro_info")
public class MetroEntity {
	
	@Id
	@GenericGenerator(name="auto", strategy = "increment")
	@GeneratedValue(generator = "auto")
	private int id;
	private String name;
	private double price;
	private String metroLine;
	private int noOfBogies;
	private String startPoint;
	private String endPoint;
	
	
	public MetroEntity( String name, double price, String metroLine, int noOfBogies, String startPoint,
			String endPoint) {
		this.name = name;
		this.price = price;
		this.metroLine = metroLine;
		this.noOfBogies = noOfBogies;
		this.startPoint = startPoint;
		this.endPoint = endPoint;
	}

	

	
}
