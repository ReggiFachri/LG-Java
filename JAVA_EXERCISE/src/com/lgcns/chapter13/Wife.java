package com.lgcns.chapter13;

public class Wife implements Runnable {
	private Account account;

	public Wife(Account account){
		this.account = account;
	}

	@Override
	public void run() {
		for(int i=0 ; i<1000 ; i++){
			account.deposit(100);
		}
	}
}