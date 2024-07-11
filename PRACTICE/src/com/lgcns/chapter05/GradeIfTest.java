package com.lgcns.chapter05;

public class GradeIfTest {
	public static void main( String[] args ) {

		int score = 92;

		if ( score <= 100 && score >= 90 ) {
			System.out.println("Nilai A.");
		} else if ( score < 90 && score >= 80 ) {
			System.out.println("Nilai B.");
		} else if ( score < 80 && score >= 70 ) {
			System.out.println("Nilai C.");
		} else if ( score < 70 && score >= 60 ) {
			System.out.println("Nilai D.");
		} else {
			System.out.println("Nilai F.");
		}

	}
}

