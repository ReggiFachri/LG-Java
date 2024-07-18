package com.lgcns.mission.chinesefood.biz;

import java.util.ArrayList;

import com.lgcns.mission.chinesefood.ChineseFood;
import com.lgcns.mission.chinesefood.Order;
import com.lgcns.mission.util.MissionUtil;

public class ChineseRestaurantBiz implements IChineseRestaurantBiz {
	
	private ArrayList<Order> orders;

	@Override
	public void initializeOrder() {
		Order order = null;
		ArrayList<ChineseFood> menus = new ArrayList<ChineseFood>();
		
		orders = new ArrayList<Order>();
		orders.add(new Order(1, "Rumah kita", "010-1234-5678", "Banyakin danmuji"));
		order = orders.getLast();
		menus.add(new ChineseFood(1, 4));
		menus.add(new ChineseFood(2, 3));
		menus.add(new ChineseFood(3, 2));
		menus.add(new ChineseFood(4, 1));
		order.setMenus(menus);
		
		orders.add(new Order(2, "Rumah kamu", "010-3333-5678", "Secepat mungkin"));
		orders.add(new Order(3, "Rumah dia", "010-1357-2468", "Sausnya dipisah"));
		orders.add(new Order(4, "Rumahnya", "02-6363-6363", "Banyakin sumpit"));
	}

	@Override
	public void printOrderList() {
		System.out.println("---------------------------------------------------------------------\r\n"
				+ "No Pesanan  Alamat          Kontak             Permintaan Lainnya\r\n"
				+ "---------------------------------------------------------------------");
		for(int i = 0; i < orders.size(); i++) {
			Order order = orders.get(i);
			System.out.println(order.getOrderNumber() + "\t" + order.getAddress() +"\t"+ order.getContact() +"\t"+order.getRequest());
		}
		System.out.println("---------------------------------------------------------------------");
	}

	@Override
	public void printOrderDetail() {
		System.out.print("Silahkan input No Pesanan: ");
		int orderNo = Integer.parseInt(MissionUtil.getUserInput());
		Order order = null;
		
		for(int i = 0; i < orders.size(); i++) {
			if(orders.get(i).getOrderNumber() == orderNo) {				
				order = orders.get(i);
			}
		}
		
		System.out.println("No Pesanan: " + order.getOrderNumber());
		System.out.println("Alamat: " + order.getAddress());
		System.out.println("No Tlp: " + order.getContact());
		System.out.println("Permintaan: " + order.getRequest());
		System.out.println("Daftar Pesanan");

		order.printOrderedMenus();
	}

	@Override
	public void insertOrder() {
		// TODO Auto-generated method stub
		System.out.print("Silahkan input Alamat: ");
		String address = MissionUtil.getUserInput();
		System.out.print("Silahkan input No Tlp: ");
		String phoneNumber = MissionUtil.getUserInput();
		System.out.print("Silahkan input Permintaan Lainnya: ");
		String request = MissionUtil.getUserInput();
		
		Order order = new Order(getOrderNumber(), phoneNumber, address, request);
		order.addMenu();
		orders.add(order);
	}

	@Override
	public void cancelOrder() {
		// TODO Auto-generated method stub
		System.out.print("Silahkan input No Pesanan yang akan dibatalkan: ");
		int orderNo = Integer.parseInt(MissionUtil.getUserInput());
		Order order = null;
		
		for(int i = 0; i < orders.size(); i++) {
			if(orders.get(i).getOrderNumber() == orderNo) {				
				order = orders.get(i);
			}
		}
		
		System.out.println("No Pesanan: " + order.getOrderNumber());
		System.out.println("Alamat: " + order.getAddress());
		System.out.println("No Tlp: " + order.getContact());
		System.out.println("Permintaan: " + order.getRequest());
		System.out.println("Daftar Pesanan");

		order.printOrderedMenus();
		
		System.out.print("Apakah Pesanan akan dibatalkan?(Y/N) : ");
		String option = MissionUtil.getUserInput();
		
		if(option.toLowerCase().equals("y")) {
			orders.remove(order);
			System.out.println("[MSG] Pesanan telah dibatalkan");
		}else {
			System.out.println("[MSG] Pesanan tidak dibatalkan");			
		}
		
	}

	@Override
	public void changeOrder() {
		// TODO Auto-generated method stub
		printOrderList();		
		System.out.print("Silahkan input No Pesanan yang akan diubah: ");
		int orderNo = Integer.parseInt(MissionUtil.getUserInput());
		Order order = null;
		
		for(int i = 0; i < orders.size(); i++) {
			if(orders.get(i).getOrderNumber() == orderNo) {				
				order = orders.get(i);
			}
		}
		
		System.out.println("No Pesanan: " + order.getOrderNumber());
		System.out.println("Alamat: " + order.getAddress());
		System.out.println("No Tlp: " + order.getContact());
		System.out.println("Permintaan: " + order.getRequest());
		System.out.println("Daftar Pesanan");

		order.printOrderedMenus();
		
		System.out.print("Apakah Pesanan akan diubah?(Y/N) : ");
		String option = MissionUtil.getUserInput();
		
		if(option.toLowerCase().equals("y")) {
			//kosongkan arraylist di index yang bersangkutan	
			System.out.print("Silahkan input Alamat: ");
			String address = MissionUtil.getUserInput();
			System.out.print("Silahkan input No Tlp: ");
			String phoneNumber = MissionUtil.getUserInput();
			System.out.print("Silahkan input Permintaan Lainnya: ");
			String request = MissionUtil.getUserInput();
			
			order.setAddress(address);
			order.setContact(phoneNumber);
			order.setRequest(request);
			order.getMenus().clear();
			order.addMenu();
			
			System.out.println("[MSG] Pesanan telah diubah");
		}else {
			System.out.println("[MSG] Pesanan tidak diubah");			
		}
	}

	@Override
	public void completeOrder() {
		// TODO Auto-generated method stub
		Order order = orders.getFirst();
		orders.remove(order);
		System.out.println("[MSG] Pesanan telah dikirm. Pengiriman akan dilakukan secara berurutan.");
	}

	@Override
	public int getOrderNumber() {
		// TODO Auto-generated method stub
		return orders.getLast().getOrderNumber() + 1;
	}

}
