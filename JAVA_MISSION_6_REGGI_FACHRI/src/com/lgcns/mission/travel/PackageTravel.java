package com.lgcns.mission.travel;

public class PackageTravel extends Travel{

	private int minPeople;

	public PackageTravel(String travelCode, String cityName, String flight, int minPeople) {
		super(travelCode, cityName, flight, "Paket Travel");
		this.minPeople = minPeople;
	}

	public String toString() {
		return super.toString(minPeople, 0);
	}
}
