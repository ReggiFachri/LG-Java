package com.lgcns.mission.util;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class MissionUtil {
	public static String getUserInput() {
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		return s.nextLine();
	}

    public static String moneyFormat(int price) {
        NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.KOREA);//Mata uang Korea Selatan
        //NumberFormat nf1 = NumberFormat.getCurrencyInstance(new Locale("id", "ID"));//ubah ke mata uang Indonesia
        return nf.format( price );
    }
}
