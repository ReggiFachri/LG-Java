package com.lgcns.chapter06;

public class Account {
	String accountHolder;    // Depositor
    String accountNumber;	// No Rekening
    int    balance;	// balance

    public void deposit( int money ) {
        balance += money;
    }

    public void withdraw( int money ) {
        balance -= money;
    }

    public int getBalance() {
        return balance;
    }

}
