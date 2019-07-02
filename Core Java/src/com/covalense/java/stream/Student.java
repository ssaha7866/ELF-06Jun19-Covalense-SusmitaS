package com.covalense.java.stream;

public class Student {

	String name;
	int id;
	Double percentage;

	public Student(String name, int id, double percentage) {
		super();
		this.name = name;
		this.id = id;
		this.percentage = percentage;
	}

	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

	public double getPercentage() {
		return percentage;
	}

}
