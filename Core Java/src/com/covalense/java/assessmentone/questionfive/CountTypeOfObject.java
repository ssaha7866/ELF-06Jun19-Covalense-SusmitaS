package com.covalense.java.assessmentone.questionfive;

import java.util.ArrayList;

import lombok.extern.java.Log;

@Log
public class CountTypeOfObject {

	public static void main(String[] args) {

		ArrayList<Animal> a = new ArrayList<Animal>();
		a.add(new Cow());
		a.add(new Cow());
		a.add(new Lion());
		a.add(new Cow());
		a.add(new Lion());
		a.add(new Cow());
		a.add(new Dog());
		a.add(new Dog());
		a.add(new Cow());
		a.add(new Dog());

		int cow_count = 0;
		int lion_count = 0;
		int dog_count = 0;
		// counting the instances of different objects
		for (Animal ani : a) {
			if (ani instanceof Cow) {
				cow_count++;
			} else if (ani instanceof Lion) {
				lion_count++;
			} else
				dog_count++;
		}
		// printing the number of instances

		log.info("Count of Cow objects = " + cow_count);
		log.info("Count of Lion objects = " + lion_count);
		log.info("Count of Dog objects = " + dog_count);
	}
}