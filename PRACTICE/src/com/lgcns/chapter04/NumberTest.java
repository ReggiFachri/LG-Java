package com.lgcns.chapter04;

public class NumberTest {

	public static void main(String[] args) {
		int data = 10;
		
		System.out.println("Apakah "+data+" adalah bilangan positif? : " + (data > 0));		
		System.out.println("Apakah "+data+" adalah bilangan genap? : " + (data % 2 == 0));		
		System.out.println("Apakah "+data+" adalah bilangan ganjil? : " + (data % 2 == 1));		
		System.out.println("Apakah "+data+" lebih besar dari 30? : " + (data > 30));		
	}

}