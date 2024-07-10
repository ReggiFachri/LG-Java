package com.lgcns.mission.travel;

public class Travel {

	private String travelCode;
	private String cityName;
	private String flight;
	private int travelType;
	private int maxPeople;
	private int resvPeople;
	final static int INDIVIDUAL = 0;
	final static int PACKAGE = 1;

	public Travel(String travelCode, String cityName, String flight, int travelType, int maxPeople) {
		this.travelCode = travelCode;
		this.cityName = cityName;
		this.flight = flight;
		this.travelType = travelType;
		this.maxPeople = maxPeople;
	}

	public String getTravelCode() {
		return travelCode;
	}

	public int getTravelType() {
		return travelType;
	}

	public int getMaxPeople() {
		return maxPeople;
	}

	public int getResvPeople() {
		return resvPeople;
	}

	public void setResvPeople(int resvPeople) {
		if(resvPeople < 0) {
			System.out.println("[Error] Jumlah maksimal peserta tidak boleh lebih kecil dari 0.");					
		} else {
			if(resvPeople <= getMaxPeople()) {			
				this.resvPeople = resvPeople;
				System.out.println("Jumlah maksimum orang dalam reservasi sudah diubah menjadi " + getResvPeople() + " orang.");
			}
			else if(resvPeople > getMaxPeople()) {
				System.out.println("[Error] Angka yang dimasukkan tidak boleh lebih besar dari jumlah maksimal reservasi ("+getMaxPeople()+" orang).");			
			}
			else {			
				System.out.println("Jumlah maksimum orang tidak berhasil diubah.");			
			}
		}
	}

	public void setMaxPeople(int maxPeople) {
		if (maxPeople < 0) {
			System.out.println("[Error] Jumlah maksimal peserta tidak boleh lebih kecil dari 0.");
		} else {
			if (maxPeople > this.maxPeople) {
				this.maxPeople = maxPeople;
				System.out.println("Jumlah maksimum orang dalam reservasi sudah diubah menjadi " + this.maxPeople + " orang.");
			} else if (maxPeople < this.resvPeople) {
				this.maxPeople = this.resvPeople;
				System.out.println("[Info] Dikarenakan jumlah reservasi yang sudah ada, maka jumlah maksimal orang akan disesuaikan dengan jumlah reservasi saat ini.");
				System.out.println("Jumlah maksimal reservasi diubah menjadi " + this.resvPeople + " orang.");
			} else {
				System.out.println("Jumlah maksimum orang tidak berhasil diubah.");
			}
		}
	}

	public void printTravelInfo() {
		String type = null;
		if(getTravelType() == 1) {
			type = "Paket";
		}else if(getTravelType() == 0) {
			type = "Individu";
		}

		String status = null;
		if(getMaxPeople() == getResvPeople()) {
			status = "Sold out";
		}else {
			status = "-";
		}

		//		System.out.println( this.travelCode+"\t"+this.cityName+"\t"+this.flight+"\t"+type+"\t"+this.maxPeople+"\t"+this.resvPeople+"\t"+status);

		String format = "%-15s\t%-15s\t%-20s\t%-15s\t%-20s\t%-25s\t%-15s\n";
		System.out.printf(format, this.travelCode, this.cityName, this.flight, type, this.maxPeople, this.resvPeople, status);
	}

}
