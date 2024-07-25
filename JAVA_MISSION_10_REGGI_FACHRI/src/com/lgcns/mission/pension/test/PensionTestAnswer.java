package com.lgcns.mission.pension.test;

import com.lgcns.mission.pension.biz.IPensionBiz;
import com.lgcns.mission.pension.biz.PensionBiz;
import com.lgcns.mission.util.MissionUtil;

public class PensionTestAnswer {

	public static void main(String[] args) {

        IPensionBiz biz = new PensionBiz();
		biz.initializeRoomData();
		
		int input = -1;
		
		while (input != 0) {
			printHeader();
			System.out.print("# Input menu >> ");
			
			try{
				input = Integer.parseInt(MissionUtil.getUserInput());
				if (input == 1) 
				{
					biz.roomList();
					
				} 
				else if (input == 2) 
				{
					System.out.print("Masukkan nomor kamar anda >> ");	
					String roomId = MissionUtil.getUserInput();
					
					System.out.print("silahkan input nama anda >> ");
					String custName = MissionUtil.getUserInput();
					
					System.out.print("silahkan input no.tlp anda >> ");
					String custPhone = MissionUtil.getUserInput();
					
					try{
						biz.checkIn(roomId, custName, custPhone);
					} catch (Exception e) {
						System.out.println(e.getMessage());
					}
					
				} 
				else if (input == 3) 
				{
					System.out.print("Masukkan nomor kamar anda >> ");	
					String roomId = MissionUtil.getUserInput();
					
					try {
						biz.checkOut(roomId);
					} catch (Exception e) {
						System.out.println(e.getMessage());
					}
					
				} else if (input == 0) {
					System.out.println("Bye~ Bye~");
				} else {
					System.out.println("[Errro] Silahkan input menu kembali.");
				}
			
			}catch(NumberFormatException e){
				System.out.println("[Error] Silahkan input menu kembali.");
			}
		}
		
	}

	public static void printHeader() {
		System.out.println("======<< Manajemen sistem pansion chun >>======");
		System.out.println(" 1. Periksa seluruh ruangan");
		System.out.println(" 2. Check in");
		System.out.println(" 3. Check out");
		System.out.println(" 0. Selesai");
		System.out.println("==============================");
	}
}
