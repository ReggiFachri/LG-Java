package com.lgcns.chapter09;

public class Animal{
	private int age;
	private String kind;
	
	public Animal(int age, String kind) {
		this.age = age;
		this.kind = kind;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	public void hunt() {
		System.out.println("Berburu!!");
	}
	public void run() {
		System.out.println("Lari!!");
	}
}
