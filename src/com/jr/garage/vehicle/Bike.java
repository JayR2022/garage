package com.jr.garage.vehicle;

public class Bike extends Vehicle implements VehicleImpl {
	
	private int bikeId;
	private String speedometerShape;
	
	public Bike(){
		bikeId = super.getCount();
		super.setCount(bikeId+1);
	}
	
	public int getBikeId() {
		return bikeId;
	}

	public String getSpeedometerShape() {
		return speedometerShape;
	}
	public void setSpeedometerShape(String speedometerShape) {
		this.speedometerShape = speedometerShape;
	}
	@Override
	public void classInfo() {
		System.out.println("This is a Bike");
		
	}
	
	

}
