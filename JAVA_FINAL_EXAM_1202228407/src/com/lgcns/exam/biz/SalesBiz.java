package com.lgcns.exam.biz;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

import com.lgcns.exam.AutoOrderPhoneThread;
import com.lgcns.exam.Phone;
import com.lgcns.exam.SalesPerson;

public class SalesBiz implements ISalesBiz{
	private ArrayList<SalesPerson> salesPeople;
	private HashMap<String, Phone> salesPhoneMap;

	@Override
	public void initializeVoid() {
		salesPeople = new ArrayList<SalesPerson>();

		salesPeople.add(new SalesPerson("EMP01", "Kim", "LGE", 3, "kim@lgcns.com"));
		salesPeople.add(new SalesPerson("EMP02", "Lee", "LGE", 2, "lee@lgcns.com"));
		salesPeople.add(new SalesPerson("EMP03", "Park", "SEC", 3));
		salesPeople.add(new SalesPerson("EMP04", "Choi", "SEC", 4, "choi@lgcns.com"));
		salesPeople.add(new SalesPerson("EMP05", "Jeon", "ACE", 1));

		salesPhoneMap = new HashMap<String, Phone>();

		salesPhoneMap.put("EMP01", new Phone("PHONE03", "G6", 750000, 53));
		salesPhoneMap.put("EMP03", new Phone("PHONE02", "S7", 880000, 45));
		salesPhoneMap.put("EMP02", new Phone("PHONE05", "V20", 670000, 67));
		salesPhoneMap.put("EMP05", new Phone("PHONE04", "MI", 880000, 52));
		salesPhoneMap.put("EMP04", new Phone("PHONE01", "Z8", 670000, 41));
	}

	@Override
	public void printAllSalesPerson() {
		System.out.println("--------------------------------------------<List Tenaga Penjualan>---------------------------------------------");
		for(int i = 0; i < salesPeople.size(); i++) {
			System.out.println(salesPeople.get(i).toString());
		}
		System.out.println("-------------------------------------------------------------------------------------------------------------------");
	}

	@Override
	public void printProductionList() {
		System.out.println("------------------------------------------------------------------------------\r\n"
				+ "No. Model	Nama Model	PIC		Jumlah\r\n"
				+ "------------------------------------------------------------------------------");
		//		for(Map.Entry<String, Phone> product:salesPhoneMap.entrySet()) {
		//			Phone phone = product.getValue();
		//			SalesPerson employee = searchSalesPersonByEmployeeNo(product.getKey());
		//			String email = (employee.getEmail() != null) ? employee.getEmail() : "tidak ada e-mail";
		//			System.out.println(phone.getModelNumber() + "\t\t" +phone.getModelName() + "\t" + employee.getName() + "(" + email + ")\t" + phone.getQuantity());
		//		}

		salesPhoneMap.forEach((key, value) -> {
			SalesPerson employee = searchSalesPersonByEmployeeNo(key);
			String email = (employee.getEmail() != null) ? employee.getEmail() : "tidak ada e-mail";
			System.out.println(value.getModelNumber() + "\t\t" +value.getModelName() + "\t" + employee.getName() + "(" + email + ")\t" + value.getQuantity());
		});
	}

	@Override
	public void printTotalProduction() {
		// TODO still have different order from sample run
		int i = 0;
		for(Map.Entry<String, Phone> product:salesPhoneMap.entrySet()) {
			Phone phone = product.getValue();
			System.out.println(++i + ". ["+phone.getModelNumber() + "] " +phone.getModelName() + ": " + calculateTotalProductionPrice(phone.getPrice(), phone.getQuantity()) + " won");
		}
	}

	@Override
	public void addPhoneProduct(SalesPerson salesPerson, Phone phone) {
		salesPeople.add(new SalesPerson(salesPerson.getEmployeeNo(), salesPerson.getName(), salesPerson.getCustomer(), salesPerson.getPurchaseQuantityPerSec(), salesPerson.getEmail()));
		salesPhoneMap.put(salesPerson.getEmployeeNo(), phone);
	}

	@Override
	public SalesPerson searchSalesPersonByEmployeeNo(String employeeNo) {
		SalesPerson employee = null;
		try {			
			for(int i = 0; i < salesPeople.size(); i++) {
				if(salesPeople.get(i).getEmployeeNo().equals(employeeNo)) {
					employee = salesPeople.get(i);
				}
			}
		}catch(NullPointerException e) {
			System.out.println("[Error] Tidak ada informasi karyawan yang sesuai dengan nomor karyawan yang dimasukkan.");
		}
		return employee;
	}

	private String calculateTotalProductionPrice(int price, int quantity) {
		NumberFormat nf = NumberFormat.getInstance(Locale.KOREA);
		int calculate = price * quantity;
		return nf.format(calculate);
	}

	@Override
	public void automaticOrder(String modelNum, int seconds) {
		boolean found = false;
		
		for (Map.Entry<String, Phone> entry : salesPhoneMap.entrySet()) {
	        if (entry.getValue().getModelNumber().equals(modelNum)) {
	            found = true;
	            SalesPerson salesPerson = searchSalesPersonByEmployeeNo(entry.getKey());
	            Phone phone = new Phone(modelNum, entry.getValue().getModelName(), entry.getValue().getPrice(), entry.getValue().getQuantity());
	            
	            AutoOrderPhoneThread autoOrder = new AutoOrderPhoneThread(salesPerson, phone, seconds, salesPhoneMap);
	            autoOrder.start();
	            
	            break;
	        }
	    }
		
		if(!found) {
			System.out.println("[Error] Produk tidak ditemukan");
		}
	}

}
