package com.lgcns.mission.chinesefood;

import java.util.ArrayList;

import com.lgcns.mission.util.MissionUtil;

public class Order {
	private int orderNumber;
	private String contact;
	private String address;
	private String request;
	private ArrayList<ChineseFood> menus;
	// int sampleNumber?
	public Order(int orderNumber, String contact, String address, String request) {
		this.orderNumber = orderNumber;
		this.contact = contact;
		this.address = address;
		this.request = request;
	}
		
	private void addMenu() {
		printMenu();
		String option = null;
		int quantity = 0;
		int menu = 0;
		
		menus = new ArrayList<ChineseFood>();
		
		do{			
			System.out.print("Silahkan pilih menu(1.Jajangmyun 2.jjampong 3.Nasi Goreng 4.Tangsuyuk) : ");
			menu = Integer.valueOf(MissionUtil.getUserInput());
			System.out.print("Silahkan pilih kuantitas: ");
			quantity = Integer.valueOf(MissionUtil.getUserInput());
			
			menus.add(new ChineseFood(menu, quantity));
			
			System.out.print("Apakah akan memesan lagi?(Y/N) : ");
			option = MissionUtil.getUserInput();
			
		}while(option.toLowerCase().equals("y"));
		System.out.println("Pesanan telah selesai");		
	}

	private void printMenu() {
		System.out.println("========= Papan Menu ========= \r\n"
				+ " 1. Jajangmyun - 4000 won\r\n"
				+ " 2. jjampong - 5000 won\r\n"
				+ " 3. Nasi Goreng - 5000 won\r\n"
				+ " 4. Tangsuyuk - 10000 won\r\n"
				+ "========================");
	}

	public void printOrderedMenus() {
		System.out.println("Daftar Pesanan");

		ArrayList<ChineseFood> menus = getMenus();
		int total = 0;
		for(int i = 0; i < menus.size(); i++) {
			ChineseFood menu = menus.get(i);
			System.out.println(i + " : " + menu.getName() + "\t" + menu.getNumber() + " buah\t" + menu.getPrice() + "won");	
			total += menu.getPrice();
		}
		System.out.println("---------------------------------------------------------------------");
		System.out.println("Jumlah\t\t"+total+"won");		
		System.out.println("---------------------------------------------------------------------");	
	}

	public int getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(int orderNumber) {
		this.orderNumber = orderNumber;
		addMenu();
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getRequest() {
		return request;
	}

	public void setRequest(String request) {
		this.request = request;
	}

	public ArrayList<ChineseFood> getMenus() {
		return menus;
	}

	public void setMenus(ArrayList<ChineseFood> menus) {
		this.menus = menus;
	}
}
