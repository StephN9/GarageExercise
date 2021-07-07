package garage.exercise;

public class Car extends Vehicle {

	private boolean hasSteeringWheel;

	public Car(int id, int noOfDoors, int noOfEngines, int noOfWheels, boolean hasSteeringWheel) {
		super();
		this.setId(id);
		this.setNoOfDoors(noOfDoors);
		this.setNoOfEngines(noOfEngines);
		this.setNoOfWheels(noOfWheels);
		this.setHasSteeringWheel(hasSteeringWheel);

	}

	public void setHasSteeringWheel(boolean hasSteeringWheel) {
		this.hasSteeringWheel = hasSteeringWheel;
	}

	public boolean getHasSteeringWheel() {
		return hasSteeringWheel;
	}

}
