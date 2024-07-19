package com.lgcns.chapter09;

public class ProductTest {

	public static void main(String[] args) {
		Product washer = new Product("Tongdol-i", 450000, 8 );
		Television cinemaTv = new Television("Cinema TV",3500000, 10, "Ukuran layar 151cm");

		System.out.println("===== Informasi Produk =====");
		washer.printProductInfo();
		
		System.out.println("---------------------");
		cinemaTv.printProductInfo();
		
		System.out.println("Catatan :" +cinemaTv.getDescription() );
		
		System.out.println("\r\n[Pengumuman] Diskon berubah menjadi 15%!!\r\n");
		
		washer.setDiscountRate(15);
		cinemaTv.setDiscountRate(15);
		System.out.println("Harga Jual " +washer.getName() + " : " + washer.calculateDiscountPrice());
		System.out.println("Harga Jual " +cinemaTv.getName() + " : " + cinemaTv.calculateDiscountPrice());	
	}
}
