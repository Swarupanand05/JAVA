package com.app.fruits;

public class Mango extends Fruit {
	public Mango(String color, double weight) {
		super("Mango", color, weight);
	}

	@Override
	public String taste() {
		return "sweet";
	}
}
