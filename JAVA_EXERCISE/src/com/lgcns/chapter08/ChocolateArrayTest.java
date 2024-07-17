package com.lgcns.chapter08;

import com.lgcns.chapter07.Chocolate;

public class ChocolateArrayTest {

	public static void main(String[] args) {
		
		Chocolate[] chocolates = {
				new Chocolate("Amadora", "Dark", 2200),
				new Chocolate("Cafe Crishy", "Dark", 2500),
				new Chocolate("Triple Blank", "White", 2300)
		};
		
		chocolates[0].printChocolateInfo();
		chocolates[1].printChocolateInfo();
		chocolates[2].printChocolateInfo();

	}
}
