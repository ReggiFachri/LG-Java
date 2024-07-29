package com.lgcns.exam;

import java.util.HashMap;

public class AutoOrderPhoneThread extends Thread {
	private SalesPerson salesPerson;
	private Phone phone;
	private int orderSeconds;
	private HashMap<String, Phone> salesPhoneMap;
	
	public AutoOrderPhoneThread(SalesPerson salesPerson, Phone phone, int orderSeconds, HashMap<String, Phone> salesPhoneMap) {
		this.salesPerson = salesPerson;
		this.phone = phone;
		this.orderSeconds = orderSeconds;
		this.salesPhoneMap = salesPhoneMap;
	}
	
	public void run() {
		for (int i = 0; i < orderSeconds; i++) {
            try {
                Thread.sleep(1000);

                synchronized (salesPhoneMap) { 
                    //Phone updatedPhone = new Phone(phone.getModelNumber(), phone.getModelName(), phone.getPrice(), phone.getQuantity() + salesPerson.getPurchaseQuantityPerSec());
                	
                	phone.setQuantity(phone.getQuantity() + salesPerson.getPurchaseQuantityPerSec());
                	salesPhoneMap.replace(salesPerson.getEmployeeNo(), phone); 
                }
                
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
	}
}
