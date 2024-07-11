package com.lgcns.chapter05;

public class PrintStarTest {

	public static void main(String[] args) {

		for ( int i = 1; i < 8; i++ ) {
			System.out.print("*");
			for ( int j = 1; j < i; j++ ) {
				System.out.print("*");
			}
			System.out.print("\n");
		}

	}
}
