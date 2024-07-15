package com.lgcns.chapter07;

public class Chocolate {
	String name;
	String type;
	int price;

	public String getName() {
		return name;
	}
	
	public int calculateTotalPrice(int count) {
		return count * price;
	}
	
	public int calculateTotalPrice(int count, int discount) {
		return count * price * (100 - discount)/100;
	}
	
	public void changeChocolateInfo(String newName, int newPrice) {
		name = newName;
		price = newPrice;
		printChocolateInfo();
	}

	public void changeChocolateInfo(String newName, String newType, int newPrice ) {
		name = newName;
		price = newPrice;
		type = newType;
		printChocolateInfo();
	}
	
	public void printChocolateInfo() {
		System.out.println("nama :" + name + ", jenis :" + type + ", harga :" + price );
	}

}
