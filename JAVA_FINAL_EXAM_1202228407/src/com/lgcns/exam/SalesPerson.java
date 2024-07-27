package com.lgcns.exam;

public class SalesPerson {
	private String employeeNo;
	private String name;
	private String customer;
	private int purchaseQuantityPerSec;
	private String email;
	
	public SalesPerson(String employeeNo, String name, String customer, int purchaseQuantityPerSec) {
		this.employeeNo = employeeNo;
		this.name = name;
		this.customer = customer;
		this.purchaseQuantityPerSec = purchaseQuantityPerSec;
	}

	public SalesPerson(String employeeNo, String name, String customer, int purchaseQuantityPerSec, String email) {
		this.employeeNo = employeeNo;
		this.name = name;
		this.customer = customer;
		this.purchaseQuantityPerSec = purchaseQuantityPerSec;
		this.email = email;
	}

	public String getEmployeeNo() {
		return employeeNo;
	}

	public String getName() {
		return name;
	}

	public String getCustomer() {
		return customer;
	}

	public int getPurchaseQuantityPerSec() {
		return purchaseQuantityPerSec;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		String employeeDetail = null;
		if(getEmail() == null) {
			employeeDetail = "[No.] " + employeeNo + "\t [Nama] " + name + "\t[Client] " + customer + "\t[Jumlah Pesanan] " + purchaseQuantityPerSec + "bh/detik";
		}else {
			employeeDetail = "[No.] " + employeeNo + "\t [Nama] " + name + "\t[Client] " + customer + "\t[Jumlah Pesanan] " + purchaseQuantityPerSec + "bh/detik\t[Email] " + email;			
		}
		return employeeDetail;
	}
	
}
