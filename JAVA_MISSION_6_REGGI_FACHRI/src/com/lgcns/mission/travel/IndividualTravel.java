package com.lgcns.mission.travel;

public class IndividualTravel extends Travel{

	private int maxPeople;
	
	public IndividualTravel(String travelCode, String cityName, String flight, int maxPeople) {
		super(travelCode, cityName, flight, "Individual Travel");
		this.maxPeople = maxPeople;				
	}
	
	public void setReserved(int reserved) {
		if(reserved <= 0) {
			System.out.println("[Error] Harap pesan setidaknya 1 orang.");
		} else	{
			if(reserved + super.getReserved() <= this.maxPeople) {			
				super.setReserved(reserved);
				System.out.println("Pesanan untuk " + reserved + " orang berhasil dibuat.");
			} else if (reserved + super.getReserved() > this.maxPeople) {
				System.out.println("[Error] Tidak dapat memesan lebih dari jumlah maksimum orang.");
			} else {
				System.out.println("Jumlah maksimum orang tidak berhasil diubah.");
			}
		}
	}

	public String toString() {
		String maxPeopleString = (maxPeople > 0) ? String.valueOf(maxPeople + " orang") : "N/A";
		return super.toString() + String.format("\t%-20s\t%-20s\t%s orang", "N/A", maxPeopleString, getReserved());
	}
		
}
