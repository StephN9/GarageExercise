package garage.exercise;

import java.util.ArrayList;

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

//fixing vehicle. Should loop through and calculate for the bill based on the vehicle
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

	// Calculate the price of bill based on car
	public float calculateBillForCar(Vehicle vehicle) {
		float bill = 100;
		if (vehicle instanceof Car) {
			bill += bill * vehicle.getNoOfWheels();

		}
		return bill;
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
	// if the vehicle isn't a Motorbike (or whichever class) it will add it to tmp
	// and then tmp becomes the new listOfVehicles
	public void removingVehicleType(Class<?> vehicle) {
		ArrayList<Vehicle> tmp = new ArrayList<>();
		for (Vehicle v : listOfVehicles) {
			if (!v.getClass().equals(vehicle)) {
				tmp.add(v);
			}
		}
		listOfVehicles = tmp;

	}

	// Removing all vehicles I think
	public void removeAllVehicles() {
		listOfVehicles.clear();
	}

	// print statement
	public void printVehicles() {
		for (Vehicle v : listOfVehicles) {
			System.out.println(v.getClass());
			System.out.print("ID: ");
			System.out.println(v.getId());
			System.out.print("number of Doors: ");
			System.out.println(v.getNoOfDoors());
			System.out.print("number of Engines: ");
			System.out.println(v.getNoOfEngines());
			System.out.print("Number of Wheels: ");
			System.out.println(v.getNoOfWheels());
		}
	}
}
