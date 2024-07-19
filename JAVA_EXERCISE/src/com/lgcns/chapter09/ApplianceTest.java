package com.lgcns.chapter09;

public class ApplianceTest {

	public static void main(String[] args) {
		Appliance tv = new TV();
		Appliance audio = new Audio();
		
		tv.setProduct("Television");
		audio.setProduct("Audio");
		((TV)tv).setSize(75);
		((Audio)audio).setColor("black");

		System.out.println("Television : "+((TV)tv).getSize());
		tv.turnOn();
		tv.turnOff();
		System.out.println("Audio : "+((Audio)audio).getColor());
		audio.turnOn();
		audio.turnOff();

	}

}
