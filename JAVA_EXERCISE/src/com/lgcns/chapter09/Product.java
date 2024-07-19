package com.lgcns.chapter09;

import java.text.NumberFormat;
import java.util.Locale;

public class Product {

	private String name;
	private int price;
	private int discountRate;

	public Product(String name, int price, int discountRate) {
		super();
		this.name = name;
		this.price = price;
		this.discountRate = discountRate;
	}
	public int getDiscountRate() {
		return discountRate;
	}
	public void setDiscountRate(int discountRate) {
		this.discountRate = discountRate;
	}
	public String getName() {
		return name;
	}
	public int getPrice() {
		return price;
	}
	public void printProductInfo() {
		NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.KOREA);
		System.out.println("Nama Produk: " + getName());
		System.out.println("Harga: " + nf.format(getPrice()) + "(Diskon : "+getDiscountRate()+"%)");
		System.out.println("Harga Jual: " + calculateDiscountPrice());
	}
	public String calculateDiscountPrice() {
		NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.KOREA);
		return nf.format( price * ( 100 - discountRate ) / 100);
	}
}
