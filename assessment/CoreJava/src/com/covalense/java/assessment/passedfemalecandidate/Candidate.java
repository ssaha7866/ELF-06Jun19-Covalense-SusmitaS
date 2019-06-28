package com.covalense.java.assessment.passedfemalecandidate;

public class Candidate {

	private String name;
	private int marks;
	private String gender;

	public Candidate(String name, int marks, String gender) {
		super();
		this.name = name;
		this.marks = marks;
		this.gender = gender;

	}

	public String getName() {
		return name;
	}

	public int getMarks() {
		return marks;
	}

	public String getGender() {
		return gender;
	}

}
