package com.lgcns.chapter10;

public class SuperMan extends Hero {
	public void action() {
		System.out.print("Superman ");
		fly();
		System.out.print("Superman ");
		swim();
		System.out.print("Superman ");
		fight();
	}

	@Override
	public String toString() {
		return "Superman";
	}
}
