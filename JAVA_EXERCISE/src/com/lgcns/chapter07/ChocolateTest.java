package com.lgcns.chapter07;

public class ChocolateTest {

	public static void main(String[] args) {
		int totalPrice;
		
		Chocolate choco = new Chocolate();
		
		choco.changeChocolateInfo("Café Kirish", "Dark", 2500 );
		totalPrice = choco.calculateTotalPrice( 15, 10 );

		System.out.println( choco.name + "Chocolate 15pcs (10% diskon)" + totalPrice );

		choco.changeChocolateInfo("Triple Blanc", "White", 2300 );
	}

}
