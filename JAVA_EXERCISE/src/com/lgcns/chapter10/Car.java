package com.lgcns.chapter10;

public class Car implements Washer{
	private int oilSize;

	public void go(int distance) {
		System.out.println("Berkendara "+distance+"km.");
	}

	public int getOilSize() {
		return oilSize;
	}

	public void setOilSize(int oilSize) {
		this.oilSize = oilSize;
	}

	@Override
	public void wash() {
		System.out.println("Mencuci mobil.");		
	}
}
