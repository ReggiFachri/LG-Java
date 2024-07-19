package com.lgcns.chapter10;

public class Truck extends Car {
	private int maxWeight;

	@Override
	public void go(int distance) {
		System.out.println("Naik truk dan berpindah sejauh "+distance+"km");
	}

	public int getMaxWeight() {
		return maxWeight;
	}

	public void setMaxWeight(int maxWeight) {
		this.maxWeight = maxWeight;
	}
}
