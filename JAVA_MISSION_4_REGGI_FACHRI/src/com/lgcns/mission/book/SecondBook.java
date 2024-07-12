package com.lgcns.mission.book;

import com.lgcns.mission.util.MissionUtil;

public class SecondBook extends Book {
	
	private String seller;
	private int discountRate;
	
	public SecondBook(String title, String author, int price, int stockQuantity, String seller, int discountRate) {
		super(title, author, price, stockQuantity);
		this.seller = seller;
		this.discountRate = discountRate;
	}

	public int getDiscountRate() {
		return discountRate;
	}
	
	@Override
	public String toString() {
		return "Judul : "+getTitle()+" Penulis : "+getAuthor()+" Harga : "+MissionUtil.moneyFormat(getPrice())+"   Persediaan : "+getStockQuantity()+" jilid Tingkat diskon : "+ getDiscountRate()+"% Penjual : "+ this.seller;
	}
	
}
