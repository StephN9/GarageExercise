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

		for (Vehicle v : g.getListOfVehicles()) {
			System.out.println(v.getClass());
		}

		g.removingVehicleType(Motorbike.class);

		for (Vehicle v : g.getListOfVehicles()) {
			System.out.println(v.getClass());
		}

	}
}
