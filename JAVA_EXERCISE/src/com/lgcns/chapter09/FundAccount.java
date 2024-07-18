package com.lgcns.chapter09;

public class FundAccount extends Account {

    private double earningRate;

    public double getEarningRate() {
        return earningRate;
    }

    public void setEarningRate( double earningRate ) {
        this.earningRate = earningRate;
    }

    public void earnMoney() {
        System.out.println("Keuntungan telah diperoleh.");
    }
}
