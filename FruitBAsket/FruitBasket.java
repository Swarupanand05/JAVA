package com.app.fruits;

import java.util.Scanner;

public class FruitBasket {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter basket size: ");
		int size = sc.nextInt();
		Fruit[] basket = new Fruit[size]; // Upcasting array: can hold Mango, Apple, etc.
		int counter = 0;

		int choice;
		do {
			System.out.println("\n0. Exit\n1. Add Mango\n2. Add Orange\n3. Add Apple");
			System.out.println("4. Show Fruit Names");
			System.out.println("5. Show Fresh Fruits (Full Details)");
			System.out.println("6. Mark Fruit Stale");
			System.out.println("7. Show Tastes of Stale Fruits");
			System.out.print("Enter choice: ");
			choice = sc.nextInt();

			switch (choice) {
			case 1:
				if (counter < basket.length) {
					System.out.print("Enter color: ");
					String color = sc.next();
					System.out.print("Enter weight(in Kg): ");
					double weight = sc.nextDouble();

					Fruit f = new Mango(color, weight); // Upcasting Mango to Fruit
					basket[counter++] = f;
					System.out.println("Mango added.");
				} else {
					System.out.println("Basket is full!");
				}
				break;

			case 2:
				if (counter < basket.length) {
					System.out.print("Enter color: ");
					String color = sc.next();
					System.out.print("Enter weight(in Kg): ");
					double weight = sc.nextDouble();

					Fruit f = new Orange(color, weight); // Upcasting
					basket[counter++] = f;
					System.out.println("Orange added.");
				} else {
					System.out.println("Basket is full!");
				}
				break;

			case 3:
				if (counter < basket.length) {
					System.out.print("Enter color: ");
					String color = sc.next();
					System.out.print("Enter weight(in Kg): ");
					double weight = sc.nextDouble();

					Fruit f = new Apple(color, weight); // Upcasting
					basket[counter++] = f;
					System.out.println("Apple added.");
				} else {
					System.out.println("Basket is full!");
				}
				break;

			case 4:
				System.out.println("Fruit Names:");
				for (Fruit f : basket) {
					if (f != null)
						System.out.println(f.getName());
				}
				break;

			case 5:
				System.out.println("Fresh Fruits:");
				for (Fruit f : basket) {
					if (f != null && f.isFresh()) {
						System.out.println(f); // toString()
						System.out.println("Taste: " + f.taste()); // Polymorphism
					}
				}
				break;

			case 6:
				System.out.print("Enter index to mark as stale: ");
				int index = sc.nextInt();
				if (index >= 0 && index < basket.length && basket[index] != null) {
					basket[index].setFresh(false);
					System.out.println("Marked as stale.");
				} else {
					System.out.println("Invalid index.");
				}
				break;

			case 7:
				System.out.println("Stale Fruits and Tastes:");
				for (Fruit f : basket) {
					if (f != null && !f.isFresh()) {
						System.out.println(f.getName() + " → " + f.taste());
					}
				}
				break;

			case 0:
				System.out.println("Exiting...");
				break;

			default:
				System.out.println("Invalid choice.");
			}

		} while (choice != 0);

		sc.close();
	}
}
