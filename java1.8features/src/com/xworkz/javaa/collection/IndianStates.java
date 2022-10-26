package com.xworkz.javaa.collection;

import java.util.ArrayList;
import java.util.List;

public class IndianStates {
	
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("Jammu and Kashmir");
		list.add("Hariyan");
		list.add("Andhra Pradesh");
		list.add("Manipur");
		list.add("Sikkim");
		list.add("Arunachal Pradesh");
		list.add("Himachal Pradesh");
		list.add("Meghalaya");
		list.add("Tamil Nadu");
		list.add("Assam");
		list.add("Jharkhand");
		list.add("Mizoram");
		list.add("Telangana");
		list.add("Bihar");
		list.add("Karnataka");
		list.add("Nagaland");
		list.add("Tripura");
		list.add("Chhattisgarh");
		list.add("Kerala");
		list.add("Odisha");
		list.add("Uttarakhand");
		list.add("Goa");
		list.add("Madhya pradesh");
		list.add("Punjab");
		list.add("Uttar pradesh");
		list.add("Gujarat");
		list.add("Maharashtra");
		list.add("Rajasthan");
		list.add("West Bengal");
		
		//list.forEach((ref1)->System.out.println(ref1));
		
		System.out.println("---------------------------------------");
		
		// printing all states ending with a
		list.stream().filter((ref)->ref.endsWith("a")).forEach((ref)->System.out.println(ref));
		System.out.println("---------------------------------------");
		
		// printing all states Starting with k
		list.stream().filter((nanu)->nanu.startsWith("K")).forEach((nanu)->System.out.println(nanu));
		System.out.println("---------------------------------------");
		
		// printing all states Contains l
		list.stream().filter((ninu)->ninu.contains("l")).forEach((ninu)->System.out.println(ninu));
		System.out.println("---------------------------------------");
		
		// printing all states Contains d
		list.stream().filter((ref)->ref.contains("d")).forEach((ref)->System.out.println(ref));
		System.out.println("---------------------------------------");
		
		// printing all states Contains r
		list.stream().filter((ref)->ref.contains("U")).forEach((ref)->System.out.println(ref));
		System.out.println("---------------------------------------");
		
		// printing all states Contains H
		list.stream().filter((ref)->ref.contains("H")).forEach((ref)->System.out.println(ref));
		System.out.println("---------------------------------------");
		
		
		// printing all states more than 15 Characters
		list.forEach((ref)->{
			if(ref.length()>15) {
				System.out.println(ref);
			}
		});
		
		
		System.out.println("---------------------------------------");
		
		
		// printing all states less than 5 Characters
		list.forEach((ref)->{
			if(ref.length()<5) {
				System.out.println(ref);
			}
		});
		System.out.println("---------------------------------------");
		
		
		// printing all states in upperCase
		list.stream().forEach((ref)->System.out.println(ref.toUpperCase()));
		System.out.println("---------------------------------------");
		
		// printing all states in LowerCase
		list.stream().forEach((ref)->System.out.println(ref.toLowerCase()));
		System.out.println("---------------------------------------");
		
	    
		
		// printing all states Contains r
		list.forEach((ref)->System.out.println());
		System.out.println("---------------------------------------");
		System.out.println("---------------------------------------");
		
	}

}
