package dataStructuresHomework;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapAssignment {

	public static void available(String model) {
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

		if (vehicles.get(model) != null) {
			System.out.println("Great! We'd love to show you our " + model + "s. Follow me to see our "
					+ vehicles.get(model) + "s.");
		} else {
			System.out.println("Sorry, we don't have any of that car.");
		}
	}

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		System.out.println("What model of car are you looking for?");
		String searchModel = userInput.nextLine();
		available(searchModel);
	}

}
