package com.jr.garage.vehicle;

public class Car extends Vehicle implements VehicleImpl{
	
	private int carId;
	private int noOfDoors;
	
	public Car() {
		carId = super.getCount();
		super.setCount(carId+1);
	}
	
	public int getCarId() {
		return carId;
	}


	public int getNoOfDoors() {
		return noOfDoors;
	}
	public void setNoOfDoors(int noOfDoors) {
		this.noOfDoors = noOfDoors;
	}
	@Override
	public void classInfo() {
		System.out.println("This is a Car");
		
	}
	
	
}
