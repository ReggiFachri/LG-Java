package com.lgcns.exam;

public class Phone extends Product {
	private String modelNumber;
	private String modelName;

	public Phone(String modelNumber, String modelName) {
		super(0, 0);
		this.modelNumber = modelNumber;
		this.modelName = modelName;
	}

	public Phone(String modelNumber, String modelName, int price, int quantity) {
		super(price, quantity);
		this.modelNumber = modelNumber;
		this.modelName = modelName;
	}

	public String getModelNumber() {
		return modelNumber;
	}

	public String getModelName() {
		return modelName;
	}
}