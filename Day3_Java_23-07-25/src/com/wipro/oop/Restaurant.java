package com.wipro.oop;

public class Restaurant {
	private String restuarantName;
	private String restuarantId;
	
	public Restaurant(String restuarantName, String restuarantId) {
		this.restuarantName=restuarantName;
		this.restuarantId=restuarantId;
	}
	public String getRestuarantName() {
		return restuarantName;
	}
	public void setRestuarantName(String restuarantName) {
		this.restuarantName = restuarantName;
	}
	public String getRestuarantId() {
		return restuarantId;
	}
	public void setRestuarantId(String restuarantId) {
		this.restuarantId = restuarantId;
	}
	

}
