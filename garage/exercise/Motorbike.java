package garage.exercise;

public class Motorbike extends Vehicle {

	private boolean hasHandleBars;

	public Motorbike(int id, int noOfDoors, int noOfEngines, int noOfWheels, boolean hasHandleBars) {
		super();
		this.setId(id);
		this.setNoOfDoors(noOfDoors);
		this.setNoOfEngines(noOfEngines);
		this.setNoOfWheels(noOfWheels);
		this.setHasHandleBars(hasHandleBars);

	}

	public boolean getHasHandleBars() {
		return hasHandleBars;
	}

	public void setHasHandleBars(boolean hasHandleBars) {
		this.hasHandleBars = hasHandleBars;

	}

	@Override
	public String toString() {
		return "Motorbike [hasHandleBars=" + hasHandleBars + ", getId()=" + getId() + ", getNoOfEngines()="
				+ getNoOfEngines() + ", getNoOfDoors()=" + getNoOfDoors() + ", getNoOfWheels()=" + getNoOfWheels()
				+ ", getClass()=" + getClass();
	}

}
