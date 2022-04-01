package com.jr.garage.vehicle;

public class Truck extends Vehicle implements VehicleImpl{
	
	private int truckId;
	private boolean withATrailer;
	
	public Truck(){
		truckId = super.getCount();
		super.setCount(truckId+1);
	}

	public int getTruckId() {
		return truckId;
	}

	public boolean isWithATrailer() {
		return withATrailer;
	}
	public void setWithATrailer(boolean withATrailer) {
		this.withATrailer = withATrailer;
	}
	@Override
	public void classInfo() {
		System.out.println("This is a Truck");
	}
	
	
}
