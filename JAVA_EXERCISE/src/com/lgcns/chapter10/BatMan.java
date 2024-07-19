package com.lgcns.chapter10;

public class BatMan extends Hero{
	public void action() {
		System.out.print("Batman ");
		swim();
		System.out.print("Batman ");
		fight();
	}

	@Override
	public String toString() {
		return "Batman";
	}	
}
