package com.covalense.java.arraylist;

import java.util.ArrayList;

import lombok.extern.java.Log;

@Log
public class ArrayListType3 {

	public static void main(String[] args) {
		ArrayList<Double> a = new ArrayList<Double>();
		a.add(9.2);
		a.add(1.5);
		a.add(6.9);
		a.add(2.4);
		a.add(3.6);

		log.info("Before-------->" + a);

		double d = a.set(2, 5.9);
		log.info("Replaced object is " + d);

		log.info("After-------->" + a);
	}

}
