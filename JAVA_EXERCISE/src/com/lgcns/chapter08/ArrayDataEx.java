package com.lgcns.chapter08;

public class ArrayDataEx {
    public static void main( String[] args ) {

        int[] lottoNumbers = new int[6];
        String[] names = { "Hong Gil-dong", "Hong Gil-sun", "Jeon Woo-chi" };

        lottoNumbers[0] = 23;
        lottoNumbers[1] = 31;
        lottoNumbers[2] = 6;
        lottoNumbers[3] = 11;
        lottoNumbers[4] = 27;
        lottoNumbers[5] = 3;

        System.out.println( lottoNumbers[3] );
        System.out.println( names[0] );
        System.out.println( names[1] );
        System.out.println( names[2] );
    }
}
