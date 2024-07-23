package com.lgcns.chapter13;

public class AccountTest {
	public static void main(String[] args){
		Account jointAccount = new Account(1000);
		Wife maria = new Wife(jointAccount);
		Husband james = new Husband(jointAccount);
		Thread producer = new Thread(maria, "Maria");
		Thread consumer = new Thread(james, "James");
		producer.start();
		consumer.start();
		try {
			producer.join();
			consumer.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(String.format("[%s]:Saldo saat ini: %d",     Thread.currentThread().getName(), jointAccount.getBalance()));
	}
}