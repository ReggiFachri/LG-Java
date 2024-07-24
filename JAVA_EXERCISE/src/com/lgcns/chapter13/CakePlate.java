package com.lgcns.chapter13;

public class CakePlate {
	private int breadCount=0;
	public synchronized void makeBread(){ 
		if(breadCount >= 10){ 
			try{
				wait();
			} catch(InterruptedException e) {
				System.out.println("Selesai memanggang");
			}
		}
		breadCount++;  
		System.out.println("Buat 1 roti, tersedia " + breadCount);
		notifyAll();
	}
	public synchronized void eatBread(){ 
		if(breadCount < 1){ 
			try{
				wait();
			} catch(InterruptedException e) {}
		}
		breadCount--;  
		System.out.println("Makan 1 roti, sisa " + breadCount);
		notifyAll();
	}
}

