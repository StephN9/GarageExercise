package garage.exercise;

public class Aeroplane extends Vehicle {

	private boolean hasWings;

	public Aeroplane(int id, int noOfDoors, int noOfEngines, int noOfWheels, boolean hasWings) {
		super();
		this.setId(id);
		this.setNoOfDoors(noOfDoors);
		this.setNoOfEngines(noOfEngines);
		this.setNoOfWheels(noOfWheels);
		this.setHasWings(hasWings);

	}

	public void setHasWings(boolean hasWings) {
		this.hasWings = hasWings;
	}

	public boolean getHasWings() {
		return hasWings;
	}
}
