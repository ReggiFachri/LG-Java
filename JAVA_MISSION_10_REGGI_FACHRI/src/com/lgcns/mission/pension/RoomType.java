package com.lgcns.mission.pension;

import com.lgcns.mission.util.MissionUtil;

public class RoomType {
	private int price;
	private int roomSize;
	
	public RoomType(int price, int roomSize) {
		this.price = price;
		this.roomSize = roomSize;
	}

	@Override
	public String toString() {
		return "("+ roomSize +"m2/"+MissionUtil.moneyFormat(price)+")";
	}
}
