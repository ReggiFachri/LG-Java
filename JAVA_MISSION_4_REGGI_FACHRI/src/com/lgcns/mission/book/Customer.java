package com.lgcns.mission.book;

import com.lgcns.mission.util.MissionUtil;

public class Customer {

	private int totalPrice;
	private String name;

	public Customer(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(int totalPrice) {
		this.totalPrice += totalPrice;
	}

	public void buyBook(Book book, int quantity) {
		if(quantity <= 0) {
			System.out.println("[Error] "+quantity+" jilid Kurang, tidak dapat di beli.");			
		}
		else if(book.getStockQuantity() >= quantity) {
			book.setStockQuantity(book.getStockQuantity() - quantity);	
			setTotalPrice(quantity*book.getPrice());
			System.out.println("Anda telah membeli " + book.getTitle() + ". Jumlah total : " + MissionUtil.moneyFormat(quantity*book.getPrice()));
		}else {
			System.out.println("[Error] Persediaannya kurang. Jumlah persediaan saat ini : "+book.getStockQuantity()+" jilid");			
		}
	}

	public void buyBook(SecondBook book) {
		if(book.getStockQuantity() == 1) {
			book.setStockQuantity(book.getStockQuantity() - 1);	
			setTotalPrice(book.getPrice() - (book.getPrice() * book.getDiscountRate()/100));
			System.out.println("Anda telah membeli " + book.getTitle() + ". Jumlah total : " + MissionUtil.moneyFormat(book.getPrice() - (book.getPrice() * book.getDiscountRate()/100)));
		}else {
			System.out.println("[Error] Persediaannya kurang. Jumlah persediaan saat ini : "+book.getStockQuantity()+" jilid");			
		}
	}

	@Override
	public String toString() {
		return "Nama Pelanggan : " + getName() + " Jumlah total : " + MissionUtil.moneyFormat(getTotalPrice());
	}

}
