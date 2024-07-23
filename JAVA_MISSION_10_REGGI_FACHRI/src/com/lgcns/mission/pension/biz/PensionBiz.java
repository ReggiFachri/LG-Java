package com.lgcns.mission.pension.biz;

import java.util.ArrayList;
import java.util.HashMap;

import com.lgcns.mission.pension.Customer;
import com.lgcns.mission.pension.Standard;
import com.lgcns.mission.pension.Suite;
import com.lgcns.mission.pension.exception.AlreadyCheckoutException;
import com.lgcns.mission.pension.exception.AlreadyReservedException;

public class PensionBiz implements IPensionBiz{
	private ArrayList<HashMap<String, Object>> data;

	@Override
	public void checkIn(String roomId, String custName, String custPhone) throws Exception {
		try {
			int roomNo = Integer.parseInt(roomId);

			HashMap<String, Object> room = null;

			for(int i = 0; i < data.size(); i++) {
				if(data.get(i).get("Room No").equals(roomId)) {
					room = data.get(i);
					if(room.containsKey("Customer")) {
						System.out.println("[Error] Sudah dipesan.");
					}else {						
						Customer customer = new Customer(custName, custPhone);
						room.put("Customer", customer);
						throw new AlreadyReservedException();
					}
				}
			}
			room.entrySet();

		} catch(NumberFormatException e) {
			System.out.println("[error] Silahkan masukkan angka untuk nomor kamar.");
		} catch(NullPointerException e) {
			System.out.println("[Error] Silahkan masukkan nomor kamar yang benar.");
		}

	}

	@Override
	public void checkOut(String roomId) throws Exception {
		try {
			int roomNo = Integer.parseInt(roomId);

			HashMap<String, Object> room = null;

			for(int i = 0; i < data.size(); i++) {
				if(data.get(i).get("Room No").equals(roomId)) {
					room = data.get(i);
					if(room.containsKey("Customer")) {						
						room.remove("Customer");
						throw new AlreadyCheckoutException();
					}else {
						System.out.println("[Error] Check out sudah dilakukan.");
					}
				}
			}

			room.remove("Customer");

		} catch(NumberFormatException e) {
			System.out.println("[error] Silahkan masukkan angka untuk nomor kamar.");
		} catch(NullPointerException e) {
			System.out.println("[Error] Silahkan masukkan nomor kamar yang benar.");
		}
	}

	@Override
	public void initializeRoomData() {
		data = new ArrayList<HashMap<String, Object>>();

		HashMap<String, Object> first = new HashMap<String, Object>();
		Object room101 = new Standard(80000, 14);
		first.put("Room No", "101");
		first.put("Room Details", room101);
		data.add(first);

		HashMap<String, Object> second = new HashMap<String, Object>();
		Object room102 = new Standard(80000, 14);
		second.put("Room No", "102");
		second.put("Room Details", room102);
		data.add(second);

		HashMap<String, Object> third = new HashMap<String, Object>();
		Object room103 = new Standard(80000, 14);
		third.put("Room No", "103");
		third.put("Room Details", room103);
		data.add(third);

		HashMap<String, Object> fourth = new HashMap<String, Object>();
		Object room104 = new Suite(260000, 30);
		fourth.put("Room No", "104");
		fourth.put("Room Details", room104);
		data.add(fourth);

		HashMap<String, Object> fifth = new HashMap<String, Object>();
		Object room105 = new Suite(260000, 30);
		fifth.put("Room No", "105");
		fifth.put("Room Details", room105);
		data.add(fifth);

	}

	@Override
	public void roomList() {
		System.out.println("-------------Informasi ruangan-------------");
		for(HashMap<String, Object> room:data) {
			System.out.print("Kamar " + room.get("Room No") + " : " + room.get("Room Details"));

			if(room.containsKey("Customer")) {
				System.out.print(" " + room.get("Customer"));
			}

			System.out.println();
		}

	}


}
