package com.lgcns.mission.pension.test;

import com.lgcns.mission.pension.biz.*;
import com.lgcns.mission.pension.exception.*;
import com.lgcns.mission.util.MissionUtil;

public class PensionTest {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		IPensionBiz pensionInt = new PensionBiz();
		
		pensionInt.initializeRoomData();
		
		String menu = null;
		do {
			printHeader();
			System.out.print("# Input menu >> ");
			try {				
				menu = MissionUtil.getUserInput();
				int trigger = Integer.parseInt(menu);
			} catch(NumberFormatException e) {
				System.out.println("[Error] Silahkan input menu kembali");				
			}
			
			switch(menu) {
			case "1":
				pensionInt.roomList();
				break;
				
			case "2":
				System.out.print("Silahkan input nomor kamar yang akan ditempati >> ");
				String checkInRoom = MissionUtil.getUserInput();
				System.out.print("Silahkan masukkan nama anda >> ");
				String custName = MissionUtil.getUserInput();
				System.out.print("Silahkan masukkan no.tlp anda >> ");
				String custPhone = MissionUtil.getUserInput();
				try {					
					pensionInt.checkIn(checkInRoom, custName, custPhone);;
				} catch(AlreadyReservedException e) {
					System.out.println("@ Berhasil dipesan.");
				}
				break;
				
			case "3":
				System.out.print("Silahkan input nomor kamar anda >> ");
				String checkOutRoom = MissionUtil.getUserInput();
				try {					
					pensionInt.checkOut(checkOutRoom);
				}catch(AlreadyCheckoutException e) {
					System.out.println("@ Check out berhasil.");
				}
				break;

			case "0":
				System.out.println("Bye~ Bye~");
				break;
				
			default:
				System.out.println("[Error] Silahkan input menu kembali");
				break;
			}
			
		}while(!menu.equals("0"));
		
	}

	public static void printHeader() {
		System.out.println("======<< Manajemen Sistem Pansion Chun>>======\r\n"
				+ " 1. Periksa seluruh ruangan\r\n"
				+ " 2. check in\r\n"
				+ " 3. check out\r\n"
				+ " 0. Selesai\r\n"
				+ "==============================");
	}
}