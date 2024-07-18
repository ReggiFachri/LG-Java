package com.lgcns.mission.chinesefood.test;

import com.lgcns.mission.util.MissionUtil;
import com.lgcns.mission.chinesefood.biz.ChineseRestaurantBiz;
import com.lgcns.mission.chinesefood.biz.IChineseRestaurantBiz;

public class ChineseFoodTest {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		IChineseRestaurantBiz resInt = new ChineseRestaurantBiz();		
		
		resInt.initializeOrder();
		
		
		String menu = null;
		do {
			printMenu();
			System.out.print("Input Menu: ");
			menu = MissionUtil.getUserInput();
			
			switch(menu) {
			case "1":
				resInt.printOrderList();
				break;
			
			case "2":
				resInt.printOrderDetail();
				break;
			
			case "3":
				resInt.insertOrder();
				break;
			
			case "4":
				resInt.cancelOrder();
				break;
			
			case "5":
				resInt.changeOrder();
				break;
			
			case "6":
				resInt.completeOrder();
				break;
				
			case "9":
				System.out.println("[MSG] Keluar dari program manajemen pesanan");
				menu = "9";
				break;
			
			default:
				System.out.println("[ERROR] Input tidak valid");
				break;
				
			}
		}while(!menu.equals("9"));
	}
	
	public static void printMenu() {
		System.out.println("*****************************************\r\n"
				+ "Manajemen Sistem Pemesanan Restauran Chinese Chun\r\n"
				+ "*****************************************\r\n"
				+ "1. Periksa daftar pesanan \r\n"
				+ "2. Periksa detail pesanan\r\n"
				+ "3. Daftarkan pesanan\r\n"
				+ "4. Batalkan pesanan\r\n"
				+ "5. Ubah pesanan\r\n"
				+ "6. Pengiriman selesai\r\n"
				+ "9. Tutup Sistem\r\n"
				+ "*****************************************");
	}

}
