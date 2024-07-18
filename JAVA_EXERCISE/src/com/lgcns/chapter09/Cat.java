package com.lgcns.chapter09;

public class Cat extends Animal{
	private String name;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void hunt() {
		System.out.println("Tangkap tikus!!");
	}
	public void play() {
		System.out.println("Mainan sangat menyenangkan!!!");
	}	
}