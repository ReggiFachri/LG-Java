package com.lgcns.chapter02;

public class SeparateNumberTest {

	public static void main(String[] args) {
		int digit = 456;
		int hundreds = (digit - digit%100)/100;
		int tens = digit/10%10;
		int units = digit%10;
		
		System.out.println("Digit: " + digit);
		System.out.println("Ratusan Digit: " + hundreds);
		System.out.println("Puluhan Digit: " + tens);
		System.out.println("Satuan Digit: " + units);
	}

}
