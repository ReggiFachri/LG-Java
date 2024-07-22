package com.lgcns.chapter12;

public class PrintNameTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] names = {"Jeon Woo-chi", "Hong Gil-dong", "Hong Gil-sun", "Lim Kkeok-jeong"};
		
		for ( int inx = 1; inx <= names.length; inx++ ) {
			try {
                System.out.println( names[inx] );
            } catch ( ArrayIndexOutOfBoundsException e ) {
                System.out.println(
                   "Error! Anda mengakses jalan yang salah!");
            }}
		
	}

}
