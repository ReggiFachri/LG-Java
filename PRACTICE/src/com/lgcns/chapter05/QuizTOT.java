package com.lgcns.chapter05;

import java.util.Scanner;

public class QuizTOT {

	public static void main(String[] args) {
		Scanner s =  new Scanner(System.in);
		
		String a = null;
		String b = null;
		String c = null;
		
		int score = 0;
		
		for(int i = 1; i <= 10; i++) {
			System.out.println("Ronde "+i);
			
			a = s.next();
			b = s.next();
			c = s.next();
			
			if(a.equals("T") && b.equals("T") && c.equals("T")) {
				i = 11;
			}
			else if(a.equals("O") || b.equals("O") || c.equals("O")) {
				score++;
			}
		}
		System.out.println("Poin = "+ score);
	}

}
