package com.covalense.java.treeset;

public class Car implements Comparable<Car> {
	String name;
	String brand;
	int cost;
	double rating;
	
	@Override
	public int compareTo(Car c) {
		
		return this.name.compareTo(c.name);
	}

}
