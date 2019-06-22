package com.covalense.java.objectcreation;

import lombok.extern.java.Log;

public class TestA {

	public static void main(String[] args) {
		Dog d = new Dog();
		d.color = "WHITE";
		d.cost = 30000;
		d.bark();

	}

}

@Log
class Dog {
	String color;
	int cost;

	void bark() {
		log.info("" + "Dog barks");
	}
}
