package com.lgcns.mission.book;

import com.lgcns.mission.util.MissionUtil;

public class Magazine extends Book{

	private String category;
	private String description;

	public Magazine(String title, int price, String category, String description) {
		super(title, price);
		this.category = category;
		this.description = description;
	}

	public String getCategory() {
		return category;
	}
	
	public String getDescription() {
		return description;
	}

	@Override
	public String toString() {
		return "[Judul] " + getTitle() + "\t[Harga] " + MissionUtil.moneyFormat(getPrice()) + "\t[Kategori] " + getCategory() + "\t[Catatan] " + getDescription();
	}
}
