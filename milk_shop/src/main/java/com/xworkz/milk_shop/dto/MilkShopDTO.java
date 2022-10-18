package com.xworkz.milk_shop.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
@Entity
@Table(name="milkshop_info")
public class MilkShopDTO {

	@Id
	@GenericGenerator(name="auto", strategy = "increment")
	@GeneratedValue(generator = "auto")
	private int id;
	private String name;
	private String brand;
	private String owner;
	private String ambassador;
	
}
