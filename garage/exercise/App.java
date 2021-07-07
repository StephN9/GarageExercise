package garage.exercise;

public class App {
	public static void main(String[] args) {

		Garage g = new Garage();

		g.addVehicle(new Car(50, 5, 1, 4, true));
		g.addVehicle(new Aeroplane(12, 2, 2, 3, true));
		g.addVehicle(new Motorbike(14, 1, 0, 2, true));
		g.addVehicle(new Motorbike(3, 1, 0, 2, true));
		g.addVehicle(new Motorbike(9, 1, 0, 2, true));
		g.addVehicle(new Motorbike(17, 1, 0, 3, true));

		System.out.println(g.calculateBill());

		System.out.println(g.calculateTotalBill());

		// Printing out price for fixing specific vehicle (first vehicle in garage)
		System.out.println(g.fixVehicle(g.getListOfVehicles().get(0)));
		System.out.println(g.fixVehicle(g.getListOfVehicles().get(1)));

		// g.removingVehicleType(Motorbike.class);

		// g.removeAllVehicles();

		Car car1 = new Car(1, 5, 1, 4, true);
		g.addVehicle(car1);

		System.out.println(" ");

		Motorbike bike1 = new Motorbike(1, 0, 1, 3, false);

		g.removeVehicles(bike1);

		System.out.println(g.calculateBillForCar(car1));

		g.printVehicles();

		// g.toString();

	}
}
