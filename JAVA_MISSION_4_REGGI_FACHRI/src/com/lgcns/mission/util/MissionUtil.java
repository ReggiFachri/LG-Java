package com.lgcns.mission.util;

import java.text.NumberFormat;
import java.util.Locale;

public class MissionUtil {
    
    /**
     * Metode untuk mengonversi Angka yang diinput ke format mata uang Korea (KRW)
     * 
     * @param Angka
     * @return Untuk nomor tersebut String dalam format mata uang Korea (KRW)  
     */
    public static String moneyFormat(int price) {
        NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.KOREA);//Mata uang Korea Selatan
        //NumberFormat nf1 = NumberFormat.getCurrencyInstance(new Locale("id", "ID"));//ubah ke mata uang Indonesia
        return nf.format( price );
    }
}