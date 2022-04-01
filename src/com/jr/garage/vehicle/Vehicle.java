package com.jr.garage.vehicle;

public class Vehicle{
	
	private static int count = 0;
	private boolean taxPaid;
	private String fuelType;
	private String color;
	private float price;
	
	public Vehicle() {
		// Default constructor
	}

	public boolean isTaxPaid() {
		return taxPaid;
	}

	public void setTaxPaid(boolean taxPaid) {
		this.taxPaid = taxPaid;
	}

	public String getFuelType() {
		return fuelType;
	}

	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}

	public int getCount() {
		return count;
	}
	
	public void setCount(int vehicleID) {
		this.count = vehicleID;	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}
	
	
	

}
