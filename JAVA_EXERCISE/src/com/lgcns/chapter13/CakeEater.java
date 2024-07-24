package com.lgcns.chapter13;

public class CakeEater extends Thread {
	private CakePlate cakePlate;
	public CakeEater(CakePlate cakePlate){
		this.cakePlate=cakePlate;
	}
	public CakePlate getCakePlate(){ 
		return cakePlate;
	}
	public void run(){
		for(int i=0 ; i<50; i++){
			cakePlate.eatBread();
		}
	}
}
