package com.lgcns.mission.pension;

public class Suite extends RoomType {

	public Suite(int price, int roomSize) {
		super(price, roomSize);
	}

	@Override
	public String toString() {
		return "Suite room " + super.toString();
	}
}
