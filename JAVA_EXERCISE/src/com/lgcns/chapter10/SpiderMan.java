package com.lgcns.chapter10;

public class SpiderMan extends Hero {
	public void action() {
		System.out.print("Spiderman ");
		fight();
	}

	@Override
	public String toString() {
		return "Spiderman";
	}
}
