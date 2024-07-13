package com.lgcns.chapter04;

public class CalculatorTest {

	public static void main(String[] args) {
		int num1 = 20, num2 = 7;

		int add = num1 + num2;
		int sub = num1 - num2;
		int mul = num1 * num2;
		int div = num1 / num2;
		int mod = num1 % num2;

		System.out.println("Hasil penjumlahan: " + add );
		System.out.println("Hasil pengurangan: " + sub );
		System.out.println("Hasil perkalian: " + mul);
		System.out.println("Hasil pembagian: " + div);
		System.out.println("Sisa: " + mod);
	}

}