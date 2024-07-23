package com.lgcns.mission.pension;

public class Customer {
	private String name;
	private String phone;

	public Customer(String name, String phone) {
		this.name = name;
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "Tamu saat ini - [Nama] "+name+" [No.tlp] " + phone;
	}
}
