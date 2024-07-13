package com.lgcns.chapter04;
public class InDeOperatorTest {

	public static void main(String[] args) {
		int number = 20;

		System.out.println( ++number ); //20+1 -> print(21)
		System.out.println( number++ ); //print(21) -> 21+1
		System.out.println( --number ); //22-1 -> print(21)
		System.out.println( number-- ); //print(21) -> 21-1
	}
}