package com.xworkz.tv;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component

public class TvSetupbox  {
	
	@Value("Lenovo")
	private String companyName;
	
	     public TvSetupbox(){
	    	 System.out.println(this.getClass().getSimpleName()+" bean is created");
	}

//	     
//		public TvSetupbox(String companyName) {
//				this.companyName = companyName;
//		}
//
//
//		public String getCompanyName() {
//			return companyName;
//		}
//
//		public void setCompanyName(String companyName) {
//			this.companyName = companyName;
//		}


		@Override
		public String toString() {
			return "TvSetupbox [companyName=" + companyName + "]";
		}
	     

}
