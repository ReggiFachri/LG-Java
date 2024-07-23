package com.lgcns.mission.pension;

public class Standard extends RoomType{

	public Standard(int price, int roomSize) {
		super(price, roomSize);
	}

	@Override
	public String toString() {
		return "Standard room " + super.toString();
	}
}
