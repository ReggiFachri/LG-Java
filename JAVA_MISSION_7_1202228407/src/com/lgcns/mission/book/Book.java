package com.lgcns.mission.book;

import com.lgcns.mission.util.MissionUtil;

public class Book {
	
	private String title;
	private int price;
	
	public Book(String title, int price) {
		this.title = title;
		this.price = price;
	}
	
	public String getTitle() {
		return title;
	}
	
	public int getPrice() {
		return price;
	}
	
	public String toString() {
		return "[Judul] " + getTitle() + "\t[Harga] " + MissionUtil.moneyFormat(getPrice());
	}
}
