package com.lgcns.chapter13;

public class Account {
	private int balance;

	public Account(int balance) { this.balance = balance; }

	public int getBalance() {  return balance;  }

	public synchronized void deposit(int amount){
		System.out.println(String.format("[%s]:Jumlah sebelum deposit : %d (+%d)", 
				Thread.currentThread().getName(), balance, amount));

		try {
			Thread.sleep(50);
			balance = balance + amount;
			System.out.println(String.format("[%s]:Jumlah setelah deposit: %d",              
					Thread.currentThread().getName(), balance));
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}

	public synchronized void withDraw(int amount){
		System.out.println(String.format("[%s]:Jumlah sebelum penarikan : %d (-%d)", 
				Thread.currentThread().getName(), balance, amount));

		try {
			Thread.sleep(50);
			balance = balance - amount;
			System.out.println(String.format("[%s]:Jumlah setelah penarikan: %d",              
					Thread.currentThread().getName(), balance));
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
