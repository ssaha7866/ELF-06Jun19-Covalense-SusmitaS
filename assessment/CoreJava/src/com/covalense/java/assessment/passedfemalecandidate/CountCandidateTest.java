package com.covalense.java.assessment.passedfemalecandidate;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.function.Function;

public class CountCandidateTest {

	public static void main(String[] args) {

		/*
		 * Function<String,String>f=(i,j)->if(i.compareTo(j)) return
		 * 
		 * Candidate c=(i)->{ if(i>=40 && j.gender.compareTo(c.gender)); };
		 */

		Candidate c1 = new Candidate("Priya", 40, "female");
		Candidate c2 = new Candidate("Ajay", 50, "male");
		Candidate c3 = new Candidate("Sunita", 34, "female");
		Candidate c4 = new Candidate("Shalini", 87, "female");
		Candidate c5 = new Candidate("Priyadarshan", 88, "male");

		ArrayList<Candidate> al = new ArrayList<Candidate>();
		al.add(c1);
		al.add(c2);
		al.add(c3);
		al.add(c4);
		al.add(c5);

	}

}
