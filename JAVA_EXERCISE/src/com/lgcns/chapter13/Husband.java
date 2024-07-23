package com.lgcns.chapter13;

public class Husband implements Runnable {
	private Account account;

	public Husband(Account account){
		this.account = account;
	}

	@Override
	public void run() {
		for(int i=0 ; i<1000 ; i++){ 
			account.withDraw(100);
		}
	}
}
