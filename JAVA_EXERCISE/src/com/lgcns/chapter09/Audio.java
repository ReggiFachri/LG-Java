package com.lgcns.chapter09;

public class Audio extends Appliance {
	private String color;

	@Override
	public void turnOn() {
		System.out.println("Audio : Music Play");
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
}
