package com.lgcns.chapter09;

import java.text.NumberFormat;
import java.util.Locale;

public class FundAccount extends Account {

	private double earningRate;

	public FundAccount(String number, String name, int balance, double earningRate) {
		super(number, name, balance);
		this.earningRate = earningRate;
	}

	public double getEarningRate() {
        return earningRate;
    }

    public void setEarningRate( double earningRate ) {
        this.earningRate = earningRate;
    }

    public void earnMoney() {
        System.out.println("Keuntungan telah diperoleh.");
    }

	@Override
	public void openAccount() {
		NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.KOREA);
      
		super.openAccount();
		System.out.print("FundAccount Number: ");
        System.out.println(getNumber());
        System.out.println("Pemilik akun: " + getName() );
        System.out.println("Saldo: "+ nf.format(getBalance()));
	}
    
    
}
