package com.jr.garage.garage;

import java.util.ArrayList;
import java.util.List;
import com.jr.garage.vehicle.Vehicle;

public class Garage {
	
	public List<Vehicle> garageList = new ArrayList<>();
	
	public void addVehicle(Vehicle newVehicle) {
		garageList.add(newVehicle);
	}
		
	public void removeVehicle(int id) {
		garageList.remove(id);
	}
	
	public void clearGarage() {
		garageList.clear();
	}
	
}


