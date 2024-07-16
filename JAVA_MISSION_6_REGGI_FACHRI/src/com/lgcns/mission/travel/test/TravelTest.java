package com.lgcns.mission.travel.test;

import com.lgcns.mission.travel.IndividualTravel;
import com.lgcns.mission.travel.PackageTravel;
import com.lgcns.mission.travel.Travel;
import com.lgcns.mission.util.MissionUtil;

public class TravelTest {
	public static void main(String[] args) {

		Travel[] travels = {
				new IndividualTravel("TRV001", "Munchen", "German Airways", 10),
				new IndividualTravel("TRV002", "Praha", "Air France", 20),
				new PackageTravel("TRV003", "LA", "Delta Airlines", 8),
				new IndividualTravel("TRV004", "Osaka", "Korean Air", 15),
				new PackageTravel("TRV005", "Shanghai", "Shouthern Airlines", 12)
		};

		int menu = -1;
		String travelCode = null;
		int bookReservation = 0;
		
		while (menu != 9) {
			boolean travelFound = false;
			printMenu();
			menu = MissionUtil.getUserIntegerInput();

			switch (menu) {
				case 1:
					printHeader();
					for (Travel travel : travels) {
						System.out.println(travel);
					}
					break;
				case 2:
					printHeader();
					for (Travel travel : travels) {
						if (travel.getTravelType().equals("Individual Travel")) {
							System.out.println(travel);
						}
					}
					break;
				case 3:
					printHeader();
					for (Travel travel : travels) {
						if (travel.getTravelType().equals("Paket Travel")) {
							System.out.println(travel);
						}
					}
					break;

				case 4:
					System.out.print("Input kode travel yang akan dipesan : ");
					travelCode = MissionUtil.getCodeInput();

					for (Travel travel : travels) {
						if (travel.getTravelCode().equals(travelCode)) {
							System.out.print("Input jumlah orang yang akan dipesan : ");
							bookReservation = MissionUtil.getUserIntegerInput();
							
							travel.setReserved(bookReservation);
							
							travelFound = true;
							break;
						}
					}

					if (!travelFound) {
						System.out.println("[Error] Kode yang diinput salah.");
					}

					break;

				case 9:
					System.out.println("Selesai!!");
					break;

				default:
					System.out.println("Silahkan Input kembali!!");
			}

		}
	}

	public static void printMenu() {
		System.out.println("========== < Menu > ==========");
		System.out.println(" 1. Periksa semua produk travel");
		System.out.println(" 2. Periksa produk Individual");
		System.out.println(" 3. Permintaan produk paket travel");
		System.out.println(" 4. Reservasi produk travel");
		System.out.println(" 9. End");
		printSeperator();
		System.out.print("Pilih Menu : ");
	}

	public static void printHeader() {
		printSeperator();
		System.out.printf("%-13s\t%-10s\t%-20s\t%-20s\t%-20s\t%-20s\t%-20s\n",
                "Kode Travel", "Nama Kota", "Penerbangan", "Jenis Travel", "Jumlah Minimum orang",
                "Maksimal orang yang", "Jumlah");
		System.out.printf("%-13s\t%-10s\t%-20s\t%-20s\t%-20s\t%-20s\t%-20s\n",
				"", "", "", "", "yang boleh berangkat", "bisa reservasi", "reservasi orang");
		printSeperator();
	}

	public static void printSeperator() {
		System.out.println("===============================");
	}

}