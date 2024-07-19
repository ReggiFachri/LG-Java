package com.lgcns.mission.customer.biz;

import com.lgcns.mission.customer.Customer;

import java.util.ArrayList;
import java.util.HashMap;

public class CustomerBiz implements ICustomerBiz{

	private ArrayList<Customer> customers;

	@Override
	public void initializeCustomer() {
		customers = new ArrayList<Customer>();

		HashMap<String, String> phone = new HashMap<>();
		phone.put("HP", "010-5678-1234");
		phone.put("OFFICE", "010-2132-9876");
		phone.put("Key", "HP");
		customers.add(new Customer("Lee", 28, phone));
		
		HashMap<String, String> phone2 = new HashMap<>();
		phone2.put("HP", "010-4567-9876");
		phone2.put("OFFICE", "010-1234-5678");
		phone2.put("Key", "HP");
		customers.add(new Customer("Park", 31, phone2));
		
		HashMap<String, String> phone3 = new HashMap<>();
		phone3.put("HP", "010-8888-9999");
		phone3.put("OFFICE", "010-1111-2222");
		phone3.put("Key", "OFFICE");
		customers.add(new Customer("Choi", 25, phone3));
	}

	@Override
	public void printAllCustomer() {
		System.out.println("----------------------- informasi pelanggan -----------------------");		
		for(int i = 0; i < customers.size(); i++) {
			Customer customer = customers.get(i);
			String key = customer.getPhone().get("Key");
			System.out.println(i+1 + ". nama : " + customer.getName() + "\tusia : " + customer.getAge() + "\tNo telepon : ["+key+"] " + customer.getPhone().get(key));	
		}
		System.out.println("------------------------------------------------------");
	}

	@Override
	public void insertCustomer(String name, int age, HashMap<String, String> phone) {
		customers.add(new Customer(name, age, phone));
		System.out.println("@ informasi pelanggan sudah ditambahkan.");
		System.out.println("------------------------------------------------------");
	}

	@Override
	public void changeAge(int number, int age) {
		Customer customer = customers.get(number-1);
		customer.setAge(age);
		System.out.println("@ informasi pelanggan berhasil diubah.");
		System.out.println("------------------------------------------------------");
	}

	@Override
	public void changePhone(int number, HashMap<String, String> phone) {
		// TODO Auto-generated method stub
		Customer customer = customers.get(number-1);
		customer.setPhone(phone);
		System.out.println("@ informasi pelanggan telah diubah.");
		System.out.println("------------------------------------------------------");

	}

	@Override
	public void deleteCustomer(int number) {
		if(number > getCustomerNumber() || number <= 0) {
			System.out.println("[error] tidak bisa menemukan nomor pelanggan yang sesuai.");
		}else {			
			customers.remove(number-1);
			System.out.println("@ informasi pelanggan telah dihapus.");
		}
		System.out.println("------------------------------------------------------");
	}

	@Override
	public int getCustomerNumber() {
		return customers.size();
	}

}
