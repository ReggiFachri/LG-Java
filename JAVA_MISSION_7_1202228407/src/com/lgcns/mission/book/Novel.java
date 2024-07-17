package com.lgcns.mission.book;

import com.lgcns.mission.util.MissionUtil;

public class Novel extends Book {

	private String author;

	public Novel(String title, int price, String author) {
		super(title, price);
		this.author = author;
	}

	public String getAuthor() {
		return author;
	}

	@Override
	public String toString() {
		return "[Judul] " + getTitle() + "\t[Harga] " + MissionUtil.moneyFormat(getPrice()) + "\t[Penulis] " + getAuthor();
	}
}
