package com.lgcns.chapter06;

public class Car {
	int bensin;
	String nama;
	double jarakTempuh;

	public Car(String nama) {
		this.nama = nama;
		this.bensin = 5;
	}

	public int getBensin() {
		return bensin;
	}

	public void setBensin(int bensin) {
		this.bensin = bensin;
	}

	public double getJarakTempuh() {
		return jarakTempuh;
	}

	public void setJarakTempuh(double jarakTempuh) {
		this.jarakTempuh = jarakTempuh;
	}

	//	20km/L
	public void jalan(double jarakTempuh) {
		this.jarakTempuh = jarakTempuh/getBensin();
		setBensin(bensin);
	}



}
