package com.lgcns.chapter12;

public class DivideTest {

	public static void main(String[] args) {

        for ( int inx = -3; inx <= 3; inx++ ) {
            try {
                int result = 100 / inx;
                System.out.print("100 / " + inx + " = ");
                System.out.println( result );
            } catch (ArithmeticException e) {
                System.out.println("Terjadi kesalahan kalkulasi!!");
            } finally {
                System.out.println("---------------");
            }
        }

	}

}