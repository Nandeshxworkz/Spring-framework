package com.xworkz.football;

public class AirFilled {

	private String isAirFilled;
	
public AirFilled() {
	System.out.println(this.getClass().getSimpleName()+" bean is created");
}

@Override
public String toString() {
	return "AirFilled [isAirFilled=" + isAirFilled + "]";
}




}
