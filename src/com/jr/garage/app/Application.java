package com.jr.garage.app;

import com.jr.garage.vehicle.Bike;
import com.jr.garage.vehicle.Car;
import com.jr.garage.vehicle.Truck;

public class Application {
	public static void main(String[] args) {
		System.out.println("Garage Main App");
		
		Car newJaguar = new Car();
		newJaguar.setColor("Red");
		newJaguar.setFuelType("Diesel");
		newJaguar.setPrice(30156.002f);
		newJaguar.setTaxPaid(true);
		newJaguar.setNoOfDoors(5);
		
		Bike newBike1 = new Bike();
		newBike1.setColor("Black");
		newBike1.setFuelType("Petrol");
		newBike1.setPrice(5670.002f);
		newBike1.setSpeedometerShape("Circle");
		newBike1.setTaxPaid(true);
		
		Car newJaguar1 = new Car();
		newJaguar.setColor("Red");
		newJaguar.setFuelType("Diesel");
		newJaguar.setPrice(30156.002f);
		newJaguar.setTaxPaid(true);
		newJaguar.setNoOfDoors(5);
		
		Truck newTruck1 = new Truck();
		newTruck1.setColor("Grey");
		newTruck1.setFuelType("Electric");
		newTruck1.setPrice(100000.002f);
		newTruck1.setTaxPaid(true);
		newTruck1.setWithATrailer(true);
		
		newJaguar.classInfo();
		System.out.println("id "+newJaguar.getCarId());
		newBike1.classInfo();
		System.out.println("id "+ newBike1.getBikeId());
		newTruck1.classInfo();
		System.out.println("id "+ newTruck1.getTruckId());
		newJaguar1.classInfo();
		System.out.println("id "+newJaguar1.getCarId());
		
	}

}
