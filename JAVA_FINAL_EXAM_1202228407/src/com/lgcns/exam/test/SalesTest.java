package com.lgcns.exam.test;

import com.lgcns.exam.Phone;
import com.lgcns.exam.SalesPerson;
import com.lgcns.exam.biz.*;
import com.lgcns.exam.util.CommonUtil;

public class SalesTest {

	public static void main(String[] args) {
		ISalesBiz salesBiz = new SalesBiz();

		salesBiz.initializeVoid();

		int menu = 0;
		while(menu != 9) {

			printMenu();
			System.out.print("## Pilih menu: ");
			try {				
				menu = Integer.parseInt(CommonUtil.getUserInput());

				switch(menu) {
				case 1:
					salesBiz.printAllSalesPerson();
					break;

				case 2:
					salesBiz.printProductionList();
					break;

				case 3:
					salesBiz.printTotalProduction();;
					break;

				case 4:
					System.out.print("> Masukkan nomor karyawan yang emailnya ingin Anda ubah : ");
					SalesPerson employee = null;
					try {					
						String employeeNo = CommonUtil.getUserInput();
						employee = salesBiz.searchSalesPersonByEmployeeNo(employeeNo);
						employee.getEmployeeNo();
					}catch(NullPointerException e) {
						System.out.println("[Error] Tidak ada informasi karyawan yang sesuai dengan nomor karyawan yang dimasukkan.");
						break;
					}
					System.out.print("> Masukkan email yang akan diubah: ");
					String employeeEmail = CommonUtil.getUserInput();
					employee.setEmail(employeeEmail);
					System.out.println("@ Email telah berhasil dirubah.");
					break;

				case 5:
					try {
						System.out.print("> Masukkan nomor model HP yang akan ditambah : ");
						String phoneNo = CommonUtil.getUserInput();
						System.out.print("> Masukkan nama model HP yang akan ditambah : ");
						String phoneName = CommonUtil.getUserInput();
						System.out.print("> Masukkan harga model HP yang akan ditambah : ");
						int phonePrice = Integer.parseInt(CommonUtil.getUserInput());
						System.out.print("> Masukkan nomor karyawan PIC model HP yang akan ditambah : ");
						String phonePICNo = CommonUtil.getUserInput();
						System.out.print("> Masukkan nama karyawan : ");
						String phonePICName = CommonUtil.getUserInput();
						System.out.print("> Masukkan email karyawan : ");
						String phonePICEmail = CommonUtil.getUserInput();
						System.out.print("> Masukkan client karyawan : ");
						String phonePICClient = CommonUtil.getUserInput();
						System.out.print("> Jumlah pesanan otomatis per detik : ");
						int phoneMaxAuto = Integer.parseInt(CommonUtil.getUserInput());

						Phone phone = new Phone(phoneNo, phoneName, phonePrice, 0);
						SalesPerson pic = new SalesPerson(phonePICNo, phonePICName, phonePICClient, phoneMaxAuto, phonePICEmail);

						salesBiz.addPhoneProduct(pic, phone);
						System.out.println("@ Model HP baru dan karyawan penanggung jawab telah berhasil ditambahkan.");

					}catch(NumberFormatException e) {
						System.out.println("[Error] Harap masukkan angka saja.");
					}

					break;
					
				case 6:
					try {						
						System.out.print(" > Masukkan lama pemesanan otomatis berjalan : ");
						int autoOrderDuration = Integer.parseInt(CommonUtil.getUserInput());

						System.out.print(" > Masukkan nomor produk : ");
						String modelNo = CommonUtil.getUserInput();
						
						
												
					}catch(NumberFormatException e) {						
						System.out.println("[Error] Harap masukkan angka saja.");
					}
					break;

				case 9:
					System.out.println("Program dikeluarkan. Bye~ Bye~");
					break;

				default:
					System.out.println("[Error] Anda memasukkan nomor yang tidak ada dalam menu.");
					break;

				}

			}catch(NumberFormatException e) {
				System.out.println("[Error] Harap masukkan angka saja.");
				menu = 0;
			}
		}
	}

	public static void printMenu() {
		System.out.println("=========== << Menu >> ============\r\n"
				+ "1. Periksa semua informasi tenaga penjualan\r\n"
				+ "2. Periksa semua model HP bekas\r\n"
				+ "3. Periksa jumlah total inventaris berdasarkan model HP\r\n"
				+ "4. Ubah email tenaga penjualan\r\n"
				+ "5. Tambahkan model HP bekas atau informasi tenaga penjualan\r\n"
				+ "6. Pembelian otomatis HP bekas\r\n"
				+ "9. Keluar\r\n"
				+ "================================");
	}

}
