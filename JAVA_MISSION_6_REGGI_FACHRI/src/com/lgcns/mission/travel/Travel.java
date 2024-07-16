package com.lgcns.mission.travel;

public class Travel {

	private String travelCode;
	private String cityName;
	private String flight;
	private String travelType;
	private int reserved;

	public Travel(String travelCode, String cityName, String flight, String travelType) {
		this.travelCode = travelCode;
		this.cityName = cityName;
		this.flight = flight;
		this.travelType = travelType;
	}

	public String getTravelCode() {
		return travelCode;
	}

	public String getTravelType() {
		return travelType;
	}

	public void setReserved(int reserved) {
		if(this.getTravelType().equals("Individual Travel")) {			
			this.reserved += reserved;
		}
		else if(this.getTravelType().equals("Paket Travel")) {
			if (reserved <= 0) {
				System.out.println("[Error] Harap pesan setidaknya 1 orang.");
			}else {
				this.reserved += reserved;
				System.out.println("Pesanan untuk " + reserved + " orang berhasil dibuat.");
			}
		}
	}

	public int getReserved() {
		return reserved;
	}

	public String toString(int minPeople, int maxPeople) {
		String minPeopleString = (minPeople > 0) ? String.valueOf(minPeople + " orang") : "N/A";
		String maxPeopleString = (maxPeople > 0) ? String.valueOf(maxPeople + " orang") : "N/A";
		return String.format("%-13s\t%-10s\t%-20s\t%-20s\t%-20s\t%-20s\t%s orang",
				getTravelCode(), cityName, flight, getTravelType(), minPeopleString, maxPeopleString, getReserved());

	}	
}
