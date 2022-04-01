package com.jr.garage.app;

import com.jr.garage.garage.Garage;
import com.jr.garage.vehicle.Bike;
import com.jr.garage.vehicle.Car;
import com.jr.garage.vehicle.Truck;

public class Application {
	public static void main(String[] args) {
		System.out.println("Garage Main App");
		
		Garage newGarage = new Garage();
		
		Car newJaguar = new Car();
		newJaguar.setColor("Red");
		newJaguar.setFuelType("Diesel");
		newJaguar.setPrice(30156.002f);
		newJaguar.setTaxPaid(true);
		newJaguar.setNoOfDoors(5);
		
		// parking vehicle into garage
		newGarage.addVehicle(newJaguar);
		
		Bike newBike1 = new Bike();
		newBike1.setColor("Black");
		newBike1.setFuelType("Petrol");
		newBike1.setPrice(5670.002f);
		newBike1.setSpeedometerShape("Circle");
		newBike1.setTaxPaid(true);
		
		// parking vehicle into garage
		newGarage.addVehicle(newBike1);
		
		Car newJaguar1 = new Car();
		newJaguar.setColor("Red");
		newJaguar.setFuelType("Diesel");
		newJaguar.setPrice(30156.002f);
		newJaguar.setTaxPaid(true);
		newJaguar.setNoOfDoors(5);
		
		// parking vehicle into garage
		newGarage.addVehicle(newJaguar1);
		
		Truck newTruck1 = new Truck();
		newTruck1.setColor("Grey");
		newTruck1.setFuelType("Electric");
		newTruck1.setPrice(100000.002f);
		newTruck1.setTaxPaid(true);
		newTruck1.setWithATrailer(true);
		
		// parking vehicle into garage
		newGarage.addVehicle(newTruck1);
		
		for (int i = 0; i < newGarage.garageList.size(); i++) {
		    System.out.println(newGarage.garageList.get(i).getClass());
		}
		
		newGarage.removeVehicle(3);
		System.out.println(newGarage.garageList.size());
		
		for (int i = 0; i < newGarage.garageList.size(); i++) {
		    System.out.println(newGarage.garageList.get(i).getClass());
		}
		
		// Clear garage
		newGarage.clearGarage();
		System.out.println(newGarage.garageList.size());
		
	}

}
