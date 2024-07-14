package com.lgcns.chapter06;

public class InstanceHelpEx {
	public static void main( String[] args ) {

		Account account = new Account();

		account.deposit(10000);
		int balanceAfterDeposit = account.getBalance();
		System.out.println( balanceAfterDeposit );

		Account account2 = new Account();

		int balance = account2.getBalance();
		System.out.println( balance );
	}
}
