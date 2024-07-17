package com.lgcns.chapter07;

public class Chocolate {
	private String name;
    private String type;
    private int price;
    public Chocolate( String name, String type, int price ) {
        this.name = name;
        this.type = type;
        this.price = price;
    }

    public void printChocolateInfo() {
        System.out.println("nama :" + name +", tipe :" +type + ", harga :"+ price );
    }

}
