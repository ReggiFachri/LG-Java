package com.lgcns.chapter05;

public class TestMenu {

	public static void main(String[] args) {
		int menuNum = 3;

		System.out.println( "==========================" );
		System.out.println( "1. Daftar" );
		System.out.println( "2. Temukan ID" );
		System.out.println( "3. Lupa kata sandi" );
		System.out.println( "4. Keluar" );
		System.out.println( "==========================" );
		System.out.println( "Masukkan menu yang Anda inginkan  :" + menuNum );

		switch ( menuNum ){
		case 1 : 
			System.out.println( "**Pendaftaran berhasil!!**" );
			break;
		case 2 : 
			System.out.println( "**Pencarian ID berhasil!!**" );
			break;
		case 3 : 
			System.out.println( "**Pengambilan kata sandi berhasil!!**" );
			break;
		case 4 : 
			System.out.println( "**keluar.**" );
			break;  
		default : 
			System.out.println( "** Silakan masuk ke menu yang benar ~** " );
			break;                  
		}
	}
}