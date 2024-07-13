package com.lgcns.chapter04;

public class GradeTest {

	public static void main(String[] args) {
		int score = 75;
		
		System.out.println("A : " + (score <= 100 && score >= 90));
		System.out.println("B : " + (score <= 89 && score >= 80));
		System.out.println("C : " + (score <= 79 && score >= 70));
		System.out.println("D : " + (score <= 69 && score >= 60));
	}
}
