package com.lgcns.chapter10;

public class Taxi extends Car {
	private int maxNum;

	@Override
	public void go(int distance) {
		System.out.println("Naik taksi dan berpindah sejauh "+distance+"km");
	}
	public int getMaxNum() {
		return maxNum;
	}	
	public void setMaxNum(int maxNum) {
		this.maxNum = maxNum;
	}	
}
