package com.lgcns.mission.travel;

//import java.util.Scanner;

public class TravelTest {
	public static void main(String[] args) {

		//Scanner s = new Scanner(System.in);

		Travel[] travels = {
				new Travel( "TRV001", "Munchen", "German Airways", Travel.INDIVIDUAL, 10 ),
				new Travel( "TRV002", "Prague", "Air France", Travel.INDIVIDUAL, 20 ),
				new Travel( "TRV003", "LA", "Delta Airlines", Travel.PACKAGE, 12 ),
				new Travel( "TRV004", "Osaka", "Korean Air", Travel.INDIVIDUAL, 15 ),
				new Travel( "TRV005", "Shanghai", "Shouthern Airlines", Travel.PACKAGE, 10 )
		};

		int menu = -1;
		String travelCode = null;
		int maxPeople = 0;
		int resvPeople = 0;
		boolean travelFound = false;

		while(menu != 9) {
			printMenu();
			menu = MissionUtil.getUserIntegerInput();

			switch(menu) {
			case 1:
				printHeader();
				for(Travel travel : travels) {
					travel.printTravelInfo();
				}
				break;
			case 2:
				printHeader();
				for(Travel travel : travels) {
					if(travel.getTravelType() == 0) {						
						travel.printTravelInfo();
					}
				}
				break;
			case 3:
				printHeader();
				for(Travel travel : travels) {
					if(travel.getTravelType() == 1) {						
						travel.printTravelInfo();
					}
				}

				break;

			case 4:
				System.out.print("Masukkan code travel : ");
				travelCode = MissionUtil.getCodeInput();
				System.out.print("Masukkan jumlah maksimum orang dalam reservasi untuk diubah : ");
				maxPeople = MissionUtil.getUserIntegerInput();

				for(Travel travel : travels) {
					if(travel.getTravelCode().equals(travelCode)) {						
						travel.setMaxPeople(maxPeople);
						travelFound = true;
						break;
					}
				}

				if(!travelFound) {
					System.out.println("[Error] Tidak ditemukan paket yang cocok dengan code travel ["+travelCode+"].");
				}

				break;

			case 5:
				System.out.print("Masukkan code travel : ");
				travelCode = MissionUtil.getCodeInput();
				System.out.print("Masukkan jumlah maksimum orang dalam reservasi untuk diubah : ");
				resvPeople = MissionUtil.getUserIntegerInput();

				for(Travel travel : travels) {
					if(travel.getTravelCode().equals(travelCode)) {						
						travel.setResvPeople(resvPeople);
						travelFound = true;
						break;
					}
				}

				if(!travelFound) {
					System.out.println("[Error] Tidak ditemukan paket yang cocok dengan code travel ["+travelCode+"].");
				}

				break;

			case 9:
				System.out.println("Keluar!!");					
				break;

			default:
				System.out.println("Silahkan masukkan ulang!!");
			}

		}
	}

	public static void printMenu() {
		System.out.println( "========== < Menu > ==========" );
		System.out.println( " 1. Lihat semua paket perjalanan" );
		System.out.println( " 2. Pencarian paket individu" );
		System.out.println( " 3. Pencarian paket perjalanan" );
		System.out.println( " 4. Perubahan jumlah maksimal peserta" );
		System.out.println( " 5. Perubahan jumlah peserta dalam reservasi" );
		System.out.println( " 9. End" );
		System.out.println( "==============================" );
		System.out.print( "Pilih Menu : " );
	}

	public static void printHeader() {
		printSeperator();
		System.out.println( "Kode Travel\tNama Kota\tAirline\tJenis Paket\t\tJumlah Peserta Max\tJml Peserta Saat Ini" );
		printSeperator();
	}

	public static void printSeperator() {
		System.out.println( "===============================" );
	}

}
