package com.covalense.java.objectclass;

public final class Employee1 {
	private final String name;
	private final int age;
	private final double height;
	private final char gender;
	private final boolean status;
	
	
	public Employee1(String name, int age, double height, char gender, boolean status) {
		super();
		this.name = name;
		this.age = age;
		this.height = height;
		this.gender = gender;
		this.status = status;
	}


	public String getName() {
		return name;
	}


	public int getAge() {
		return age;
	}


	public double getHeight() {
		return height;
	}


	public char getGender() {
		return gender;
	}


	public boolean isStatus() {
		return status;
	}
	

}
