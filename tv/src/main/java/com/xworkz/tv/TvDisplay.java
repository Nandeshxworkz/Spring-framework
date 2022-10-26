package com.xworkz.tv;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class TvDisplay {

	@Value("1080p")
	private String type;

	public TvDisplay() {
		System.out.println(this.getClass().getSimpleName() + " is Bean Created");
	}

	
//	public TvDisplay(String type) {
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
		return "TvDisplay [type=" + type + "]";
	}


}
