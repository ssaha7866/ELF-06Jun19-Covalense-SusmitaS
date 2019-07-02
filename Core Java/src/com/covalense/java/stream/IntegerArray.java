package com.covalense.java.stream;

import java.util.ArrayList;
import java.util.Comparator;

import lombok.extern.java.Log;

@Log
public class IntegerArray {

	public static void main(String[] args) {

		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(4);
		al.add(3);
		al.add(6);
		al.add(2);
		al.add(9);

		Comparator<Integer> c = (i, j) -> i.compareTo(j);
		Integer minValue = al.stream().min(c).get();

		log.info("minimum value in the arraylist " + minValue);
		
		Integer maxValue=al.stream().max(c).get();
		log.info("maximum value in the arraylist " + maxValue);
	}
}