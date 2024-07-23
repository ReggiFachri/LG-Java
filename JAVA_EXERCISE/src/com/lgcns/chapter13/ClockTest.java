package com.lgcns.chapter13;

public class ClockTest {
    public final static int DURATION = 60*1000;

    public static void main(String[] args){
        System.out.println("Memulai output waktu saat ini.");
        Clock clock = new Clock("Zenith");
        clock.start();

        try {
            Thread.sleep(DURATION); 
        } catch (InterruptedException e) {
            /* */
        }

        System.out.println("Mengakhiri output waktu saat ini.");
    }
}
