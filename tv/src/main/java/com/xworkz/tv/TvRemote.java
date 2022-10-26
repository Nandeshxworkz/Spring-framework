package com.xworkz.tv;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component

public class TvRemote {
	
	
	@Value("Sensor")
	private String type;
	
	public TvRemote() {
		System.out.println(this.getClass().getSimpleName()+" Bean is Created");
	}
	
//	
//
//	public TvRemote(String type) {
//		this.type = type;
//	}
//
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
		return "TvRemote [type=" + type + "]";
	}

	
	

}
