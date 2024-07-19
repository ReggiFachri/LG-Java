package com.lgcns.chapter10;

import java.text.NumberFormat;
import java.util.Locale;

public class Account {
	private String number;
	private String name;
	private int balance;
	NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.KOREA);
	
    public Account(String number, String name, int balance) {
		this.number = number;
		this.name = name;
		this.balance = balance;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}


    public void openAccount() {
        System.out.println("Buka akun.");
    }

	@Override
	public String toString() {
		return "Nomor rekening :" + getNumber() + "\r\nPemilik akun : " + getName() + " \r\nSaldo " + nf.format(getBalance()) +"\r\n";
	}
    
}