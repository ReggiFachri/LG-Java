package com.lgcns.chapter10;

public class Hero implements CanFly, CanSwim, CanFight{

	@Override
	public void fly() {
		System.out.println("terbang.");	
	}

	@Override
	public void swim() {
		System.out.println("berenang.");			
	}

	@Override
	public void fight() {
		System.out.println("berkelahi.");			
	}

	public void action() {
		System.out.println("beraksi.");			
	}

}
