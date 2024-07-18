package com.lgcns.mission.travel;

public class PackageTravel extends Travel{

	private int minPeople;

	public PackageTravel(String travelCode, String cityName, String flight, int minPeople) {
		super(travelCode, cityName, flight, "Paket Travel");
		this.minPeople = minPeople;
	}

	public String toString() {
		String minPeopleString = (minPeople > 0) ? String.valueOf(minPeople + " orang") : "N/A";
		return super.toString() + String.format("\t%-20s\t%-20s\t%s orang", minPeopleString, "N/A", getReserved());
	}
}
