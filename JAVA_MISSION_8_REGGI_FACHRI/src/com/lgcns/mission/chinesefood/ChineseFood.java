package com.lgcns.mission.chinesefood;

public class ChineseFood {
	private int menuCode;
	private String name;
	private int price;
	private int number;

	public ChineseFood(int menuCode, int number) {
		this.menuCode = menuCode;
		this.number = number;
		switch(menuCode) {
		case 1:
			this.setName("Jajangmyun");
			this.setPrice(number*4000);
			break;
		case 2:
			this.setName("Jjampong");
			this.setPrice(number*5000);
			break;
		case 3:
			this.setName("Nasi Goreng");
			this.setPrice(number*5000);
			break;
		case 4:
			this.setName("Tangsuyuk");
			this.setPrice(number*10000);
			break;
		}
	}

	public int getMenuCode() {
		return menuCode;
	}

	public void setMenuCode(int menuCode) {
		this.menuCode = menuCode;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}	
}
