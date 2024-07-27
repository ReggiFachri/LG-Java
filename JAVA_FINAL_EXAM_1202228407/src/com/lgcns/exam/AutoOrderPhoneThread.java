package com.lgcns.exam;

public class AutoOrderPhoneThread extends Thread {
	private SalesPerson salesPerson;
	private Phone phone;
	private int orderSeconds;
	
	public AutoOrderPhoneThread(SalesPerson salesPerson, Phone phone, int orderSeconds) {
		this.salesPerson = salesPerson;
		this.phone = phone;
		this.orderSeconds = orderSeconds;
	}
	
	public void run() {
		int autoOrderQuantity = orderSeconds * salesPerson.getPurchaseQuantityPerSec();
		
		phone.setQuantity(phone.getQuantity() + autoOrderQuantity);
	}
}
