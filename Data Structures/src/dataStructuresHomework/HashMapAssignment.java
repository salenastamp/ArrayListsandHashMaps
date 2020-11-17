package dataStructuresHomework;

import java.util.HashMap;

public class HashMapAssignment {
	public static void main(String[] args) {
		HashMap<String, String> vehicles = new HashMap<>();

		vehicles.put("Fit", "Honda");
		vehicles.put("Civic", "Honda");
		vehicles.put("Element", "Honda");
		vehicles.put("Pacifica", "Chrysler");
		vehicles.put("Rogue", "Nissan");
		vehicles.put("3", "Mazda");
		vehicles.put("Miata", "Mazda");
		vehicles.put("Prius", "Toyota");
		vehicles.put("Corolla", "Toyota");

		System.out.println(vehicles.get("Tbird"));
		System.out.println(vehicles.get("Prius"));

	}
}
