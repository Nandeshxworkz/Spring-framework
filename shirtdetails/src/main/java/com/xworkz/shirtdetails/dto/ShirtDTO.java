package com.xworkz.shirtdetails.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="shirt_info")
@NamedQueries({
	@NamedQuery(name="findAll",query="select shirt from ShirtDTO shirt"),
	@NamedQuery(name="findByBrand",query="select shirt from ShirtDTO shirt where shirt.brand=:br")
})
public class ShirtDTO {
	@Id
	@GenericGenerator(name="auto", strategy = "increment")
	@GeneratedValue(generator = "auto")
	private int id;
	private String brand;
	private String size;
	private String price;
	private String discount;
	private Integer quantity;
	private String gender;
	private String color;
	

}
