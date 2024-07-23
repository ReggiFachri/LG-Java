package com.lgcns.chapter13;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Clock extends Thread {

    public Clock(String name){
        if(name!=null && !name.equals("")) {
            setName(name);
        }
    }
    @Override
    public void run() {
         while(true){
            SimpleDateFormat sdf = 
                  new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String currnetDate = sdf.format(new Date());
            System.out.println("["+getName()+"] : "+ currnetDate);
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                /* */
            }
        }
    }
}
