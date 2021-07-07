package garage.exercise;

public class Vehicle {

	private int id;
	private int noOfEngines;
	private int noOfDoors;
	private int noOfWheels;

	public Vehicle() {
		super();
	}

	public Vehicle(int id, int noOfEngines, int noOfDoors, int noOfWheels) {
		super();
		this.id = id;
		this.noOfEngines = noOfEngines;
		this.noOfDoors = noOfDoors;
		this.noOfWheels = noOfWheels;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getNoOfEngines() {
		return noOfEngines;
	}

	public void setNoOfEngines(int noOfEngines) {
		this.noOfEngines = noOfEngines;
	}

	public int getNoOfDoors() {
		return noOfDoors;
	}

	public void setNoOfDoors(int noOfDoors) {
		this.noOfDoors = noOfDoors;
	}

	public int getNoOfWheels() {
		return noOfWheels;
	}

	public void setNoOfWheels(int noOfWheels) {
		this.noOfWheels = noOfWheels;
	}

}
