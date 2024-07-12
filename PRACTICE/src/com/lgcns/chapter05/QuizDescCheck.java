package com.lgcns.chapter05;

import java.util.Scanner;

public class QuizDescCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		int totalPerson = s.nextInt();
		int totalBuy = 0;
		int countDisc = 0;
		int countCash = 0;

		for(int i = 0; i < totalPerson; i++) {
			totalBuy = s.nextInt();
			System.out.println("mod 100 = "+totalBuy%100);
			System.out.println("mod 3 = "+totalBuy%3);
			System.out.println("mod 4 = "+totalBuy%4);
			System.out.println();
			
			if(totalBuy%totalBuy == 0 || totalBuy%100 != 0) {
				
				if(totalBuy%4 == 0) {
					countDisc++;
				}
				if(totalBuy%3 == 0) {
					countCash++;
				}
			}
		}
		
		System.out.print("Jumlah dapat diskon : ");
		System.out.println(countDisc);
		System.out.print("Jumlah dapat cashback : ");
		System.out.println(countCash);
	}

}