package com.lgcns.chapter07;

public class ChocolateTest {

	public static void main(String[] args) {
		int totalPrice;
		
		Chocolate choco = new Chocolate();
		
		choco.changeChocolateInfo("Amadora", "Gelap", 2200);
		totalPrice = choco.calculateTotalPrice(20);
		System.out.println("20 cokelat "+choco.name+": " + totalPrice );

		choco.changeChocolateInfo("Café Kirish", "Gelap", 2500);
		totalPrice = choco.calculateTotalPrice(15, 10);
		System.out.println("15 buah cokelat "+choco.name+" (diskon 10%): " + totalPrice );

		choco.changeChocolateInfo("Triple Blanc", "Putih", 2300);
	}

}
