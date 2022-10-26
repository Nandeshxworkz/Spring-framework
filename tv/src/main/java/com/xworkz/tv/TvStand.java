package com.xworkz.tv;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component

public class TvStand {
	
	@Value("jhcsghsc")
	private String type;
	
	public TvStand() {
		System.out.println(this.getClass().getSimpleName()+" Bean is Created");
	}

	
//	public TvStand(String type) {
//		this.type = type;
//	}
//
//
//	public String getType() {
//		return type;
//	}
//
//	public void setType(String type) {
//		this.type = type;
//	}


	@Override
	public String toString() {
		return "TvStand [type=" + type + "]";
	}

	
}
