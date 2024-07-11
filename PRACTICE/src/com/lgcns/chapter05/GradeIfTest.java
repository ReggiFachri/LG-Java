package com.lgcns.chapter05;

public class GradeIfTest {
	public static void main( String[] args ) {

		int gildongScore = 92;
		int gilsoonScore = 85;

		if ( gildongScore >= 90 ) {
			System.out.println("Hong Gil-Dong : Nilai A.");
		}else {
			System.out.println("Hong Gil-Dong : Tidak mendapat nilai A.");			
		}

		if ( gilsoonScore >= 90 ) {
			System.out.println("Hong Gil-Soon : Nilai A.");
		}else {
			System.out.println("Hong Gil-Soon : Tidak mendapat nilai A.");			
		}
	}
}

