package com.lgcns.mission.customer.biz;

import java.util.HashMap;

public interface ICustomerBiz {
	public void initializeCustomer();
	public void printAllCustomer();
	public void insertCustomer(String name, int age, HashMap<String, String> phone);
	public void changeAge(int number, int age);
	public void changePhone(int number, HashMap<String, String> phone);
	public void deleteCustomer(int number);
	public int getCustomerNumber();
}