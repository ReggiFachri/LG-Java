package com.lgcns.chapter09;

public class Appliance {
	private String product;
	private String place;
	
	public void turnOn() {
		System.out.println(this.product+" : On");
	}
	public void turnOff() {
		System.out.println(this.product+" : Off");
	}
	public void setProduct(String product) {
		this.product = product;
	}
	public String getProduct() {
		return product;
	}
}
