package com.lgcns.chapter09;

public class TV extends Appliance {
	private int size;
	
	@Override
	public void turnOn() {
		System.out.println("Television : TV On");
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
}
