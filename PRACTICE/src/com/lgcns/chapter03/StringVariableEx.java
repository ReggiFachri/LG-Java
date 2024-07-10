package com.lgcns.chapter03;

public class StringVariableEx {

	public static void main(String[] args) {
		String name = "Hong Gil-dong";
		String mathScore = "96";
		int englishScore = 82;

		int parseMathScore = Integer.parseInt( mathScore );

		System.out.println( "Nama : " + name );
		System.out.println( "skor matematika : " + mathScore );
		System.out.println( "skor Bahasa inggris : " + englishScore );
		System.out.println( "---------------" );
		System.out.println( mathScore + englishScore );
		System.out.println( parseMathScore + englishScore );
	}

}
