package com.lgcns.chapter06;

public class InstanceHelpEx {
	public static void main( String[] args ) {

		Account account = new Account();

		account.deposit(10000);
		int balanceAfterDeposit = account.getBalance();
		System.out.println( balanceAfterDeposit );

//		Account account = new Account();

		int balance = account.getBalance();
		System.out.println(balance);

	}
}
