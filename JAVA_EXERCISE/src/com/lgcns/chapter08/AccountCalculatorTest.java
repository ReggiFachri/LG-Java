package com.lgcns.chapter08;

import com.lgcns.chapter06.Account;

public class AccountCalculatorTest {

	public static void main(String[] args) {

		Account[] accounts = {
				new Account("111-2222-5551", 1000, 0),
				new Account("111-2222-5552", 2000, 0),
				new Account("111-2222-5553", 3000, 0),
				new Account("111-2222-5554", 4000, 0),
				new Account("111-2222-5555", 5000, 0),
		};
		
		for(Account account : accounts) {
			account.setInterestRate(0.045);
		}
		
		for(Account account : accounts) {
			System.out.println("Nomor Rekening : "+account.getNumber()+" / Saldo : "+account.getBalance()+"원 / Bunga : "+account.getInterestRate()*100+"%");
		}

		System.out.println("\nTingkat bunga berubah\n");

		for(Account account : accounts) {
			account.setInterestRate(0.037);
		}
		
		for(Account account : accounts) {
			System.out.println("Nomor Rekening : "+account.getNumber()+" / Bunga : "+(account.getInterestRate()*10000.0) / 100+"%"+" / Saldo : "+account.calculateInterest()+"0");
		}
		
	}

}
