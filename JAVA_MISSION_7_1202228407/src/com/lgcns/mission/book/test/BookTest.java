package com.lgcns.mission.book.test;

import com.lgcns.mission.book.biz.BookBiz;
import com.lgcns.mission.util.MissionUtil;
import com.lgcns.mission.book.Book;
import com.lgcns.mission.book.Magazine;
import com.lgcns.mission.book.Novel;

public class BookTest {

	public static void main(String[] args) {

		Book[] books = {
				new Magazine("Cooking Light", 15000, "living, cooking", "America Cooking"),
				new Magazine("Auto Bild", 16000, "science, car", "Germany Car"),
				new Novel("The Confession", 10500, "Grisham, John"),
				new Novel("Les Miserables", 17500, "Hugo, Victor"),
				new Novel("Breakthrough", 47200, "Ifill, Gwen"),
				new Novel("The Racketeer", 38000, "Grisham, John"),
		};

		BookBiz biz = new BookBiz(books);

		int menu = 0;
		do {
			printMenu();
			System.out.print("## Pilih menu: ");
			menu = MissionUtil.getUserIntegerInput();

			switch(menu) {

			case 1:
				biz.printAllBooks();
				break;
			
			case 2:
				String author;
				System.out.print("Masukkan nama penulis yang ingin dicari : ");
				author = MissionUtil.getCodeInput();
				
				biz.searchNovelByAuthor(author);
				break;

			case 3:
				int minPrice;
				int maxPrice;
				System.out.print("Masukkan harga minimum untuk novel yang ingin dicari : ");
				minPrice = MissionUtil.getUserIntegerInput();
				if(minPrice < 0) {					
					System.out.println("[Error] Informasi harga tidak boleh berisi angka negatif. Silakan masukkan lagi.");
					break;
				}
				
				System.out.print("Masukkan harga maksimum untuk novel yang ingin dicari : ");
				maxPrice = MissionUtil.getUserIntegerInput();
				if(maxPrice < 0) {
					System.out.println("[Error] Informasi harga tidak boleh berisi angka negatif. Silakan masukkan lagi.");
				}else if(maxPrice < minPrice) {
					System.out.println("[Error] Informasi harga maksimum tidak boleh lebih kecil dari minimum. Silakan masukkan lagi.");					
				}else {					
					biz.searchNovelByPrice(minPrice, maxPrice);
				}
				
				break;

			case 9:
				System.out.println("종료합니다. Bye~");
				menu = 9;
				break;

			default:
				System.out.println("[Error] Anda salah memasukkan menu. Silahkan masukkan lagi.");
				break;
			}

		}while(menu != 9);

	}

	public static void printMenu() {
		System.out.println("===== << Program Informasi Buku >> =====");
		System.out.println("1. Mencari seluruh informasi buku");
		System.out.println("2. Mencari nama penulis novel");
		System.out.println("3. Mencari harga novel (harga terendah ke harga tertinggi)");
		System.out.println("9. Keluar");
		System.out.println("==============================");
	}

}
