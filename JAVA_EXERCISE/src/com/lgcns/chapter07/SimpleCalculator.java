package com.lgcns.chapter07;

public class SimpleCalculator {

	public static void main(String[] args) {
		int number1 = 10;
        int number2 = 20;
        
        printTitle();
        System.out.println( number1 + "+" + number2 + "=" + ( number1 + number2 ) );
        printTail();
	}
	
	public static void printTitle() {
        System.out.println("===== memulai program kalkulator. =====");
    }

    public static void printTail() {
        System.out.println("======== Bye~ Bye~ ========");
    }
}
