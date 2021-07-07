package garage.exercise;

import java.util.ArrayList;
import java.util.Collections;

public class Garage {
	private ArrayList<Vehicle> listOfVehicles;

	public Garage() {
		this.listOfVehicles = new ArrayList<Vehicle>();
	}

	public ArrayList<Vehicle> getListOfVehicles() {
		return listOfVehicles;
	}

	public void setListOfVehicles(ArrayList<Vehicle> listOfVehicles) {
		this.listOfVehicles = listOfVehicles;
	}

	public void addVehicle(Vehicle vehicle) {
		listOfVehicles.add(vehicle);
	}

	// remove a vehicle by ID
	public Vehicle removeVehicles(Vehicle vehicle) {
		for (int i = 0; i < listOfVehicles.size(); i++) {
			if (listOfVehicles.get(i).getId() == vehicle.getId()) {
				listOfVehicles.remove(i);
			}
		}
		return null;
	}

	// calculate the bill of the garage by vehicles inside
	public double calculateTotalBill() {
		double bill = 0;
		for (Vehicle v : listOfVehicles) {
			if (v instanceof Motorbike) {
				bill = bill + 100;
			} else if (v instanceof Car) {
				bill = bill + 1000;
			} else if (v instanceof Aeroplane) {
				bill = bill + 500000;
			}
		}
		return bill;
	}

	public double fixVehicle(Vehicle vehicle) {
		for (Vehicle v : listOfVehicles) {
			if (v.getId() == vehicle.getId()) {
				double bill = 0;
				if (v instanceof Motorbike) {
					bill = bill + (v.getNoOfWheels() * 100);
				} else if (v instanceof Car) {
					bill = bill + (v.getNoOfDoors() * 80);
				} else if (v instanceof Aeroplane) {
					bill = bill + (v.getNoOfEngines() * 250000);
				} else {
					bill = bill + 0;
				}
				return bill;
			}
		}

		return 0;
	}

//Calculate the price of bill based on car
	public double calculateBill() {
		double bill = 0;
		for (Vehicle v : listOfVehicles) {
			if (v instanceof Motorbike) {
				bill = bill + (v.getNoOfWheels() * 100);
			} else if (v instanceof Car) {
				bill = bill + (v.getNoOfDoors() * 80);
			} else if (v instanceof Aeroplane) {
				bill = bill + (v.getNoOfEngines() * 250000);
			} else {
				bill = bill + 0;
			}
		}

		return bill;
	}

	// Remove a vehicle by type
	public void removingVehicleType(Class<?> vehicle) {
		ArrayList<Vehicle> tmp = new ArrayList<>();
		Collections.copy(tmp, listOfVehicles);
		for (int i = 0; i < listOfVehicles.size(); i++) {
			if (listOfVehicles.get(i).getClass() == vehicle) {
				tmp.remove(i);
			}
		}
		listOfVehicles = tmp;

	}

}
