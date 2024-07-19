package com.lgcns.mission.customer.test;

import java.util.HashMap;

import com.lgcns.mission.customer.biz.*;
import com.lgcns.mission.util.MissionUtil;

public class CustomerTest {

	public static void main(String[] args) {
		
		ICustomerBiz customerInt = new CustomerBiz();
		
		customerInt.initializeCustomer();
		
		String menu = null;
		
		do {
			printMenu();
			System.out.print("## Input menu : ");
			menu = MissionUtil.getUserInput();
			int customerNo = 0;
			
			switch(menu){
			case "1":
				customerInt.printAllCustomer();
				break;

			case "2":
				System.out.println("----------------------------------\r\n"
						+ " tambahkan informasi pelanggan baru.\r\n"
						+ " masukkan informasi pelanggan baru\r\n"
						+ "----------------------------------");
				
				System.out.print("> nama : ");
				String customerName = MissionUtil.getUserInput();
				System.out.print("> usia : ");
				int addCustomerAge = Integer.parseInt(MissionUtil.getUserInput());
				if(addCustomerAge > 0) {
					System.out.print("> No telepon [HP] : ");
					String hpNumber = MissionUtil.getUserInput();
					System.out.print("> No telepon [OFFICE] : ");
					String officeNumber = MissionUtil.getUserInput();
					System.out.print("> No perwakilan (HP/OFFICE) : ");
					String keyNumber = MissionUtil.getUserInput();
					
					HashMap<String, String> phone = new HashMap<>();
					phone.put("HP", hpNumber);
					phone.put("OFFICE", officeNumber);
					phone.put("Key", keyNumber);
					
					customerInt.insertCustomer(customerName, addCustomerAge, phone);
				}else {
					System.out.println("[error] usia tidak bisa di input negative.");								
				}
				break;
				
			case "3":
				System.out.println("----------------------------------\r\n"
						+ " Edit usia pelanggan.\r\n"
						+ "----------------------------------");

				System.out.print("> Nomor pelanggan yang akan di edit : ");
				customerNo = Integer.parseInt(MissionUtil.getUserInput());
				
				if(customerNo > customerInt.getCustomerNumber() || customerNo <= 0) {
					System.out.println("[error] tidak bisa menemukan nomor pelanggan yang sesuai.");
				}else {
					System.out.print("> Informasi usia yang akan di edit : ");
					int customerAge = Integer.parseInt(MissionUtil.getUserInput());
					if(customerAge > 0) {				
						customerInt.changeAge(customerNo, customerAge);
					}else {
						System.out.println("[error] usia tidak bisa di input negative.");								
					}
				}
				break;
				
			case "4":
				System.out.println("----------------------------------\r\n"
						+ " edit No telepon pelanggan.\r\n"
						+ "----------------------------------");
				
				System.out.print("> Nomor pelanggan yang akan di ubah : ");
				customerNo = Integer.parseInt(MissionUtil.getUserInput());
				
				
				if(customerNo > customerInt.getCustomerNumber() || customerNo <= 0) {
					System.out.println("[error] tidak bisa menemukan nomor pelanggan yang sesuai.");								
				}else {
					System.out.print("> No telepon yang akan di edit [HP] : ");
					String hpNumber = MissionUtil.getUserInput();
					System.out.print("> No telepon yang akan di edit [OFFICE] : ");
					String officeNumber = MissionUtil.getUserInput();
					System.out.print("> No perwakilan (HP/OFFICE) : ");
					String keyNumber = MissionUtil.getUserInput();
					
					HashMap<String, String> phone = new HashMap<>();
					phone.put("HP", hpNumber);
					phone.put("OFFICE", officeNumber);
					phone.put("Key", keyNumber);
					
					customerInt.changePhone(customerNo, phone);
				}
				break;
				
			case "5":
				System.out.println("----------------------------------\r\n"
						+ " Menghapus informasi pelanggan.\r\n"
						+ "----------------------------------");
				
				System.out.print("> Nomor pelanggan yang akan dihapus : ");
				customerNo = Integer.parseInt(MissionUtil.getUserInput());
				customerInt.deleteCustomer(customerNo);
				break;
				
			case "9":
				System.out.println("End. Bye~ Bye~");
				menu = "9";
				break;
			
			default:
				System.out.println("[Error] silahkan input menu angka yang normal~");
				break;
				
			}
			
		}while(!menu.equals("9"));
	}
	
	public static void printMenu() {
		System.out.println("=== << Program manajemen pelanggan >> ===\r\n"
				+ " 1. Mendapat informasi semua pelanggan\r\n"
				+ " 2. Tambahkan informasi pelanggan\r\n"
				+ " 3. Edit usia pelanggan\r\n"
				+ " 4. Edit nomor telepon pelanggan\r\n"
				+ " 5. Hapus informasi pelanggan\r\n"
				+ " 9. Keluar sistem\r\n"
				+ "==========================");
	}

}
