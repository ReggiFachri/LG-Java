package com.lgcns.chapter10;

public class CarTest {

	public static void main(String[] args) {
		Car taxi = new Taxi();
		Car truck = new Truck();
		
		Washer car = new Car();
		
		car.wash();
		System.out.print("Taksi : ");
		taxi.wash();
		System.out.print("Truk : ");
		truck.wash();	
	}
}
