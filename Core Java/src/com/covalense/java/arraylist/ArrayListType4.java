package com.covalense.java.arraylist;

import java.util.ArrayList;

import lombok.extern.java.Log;

@Log
public class ArrayListType4 {

	public static void main(String[] args) {
		ArrayList<Double> a = new ArrayList<Double>();
		a.add(9.2);
		a.add(1.5);
		a.add(6.9);
		a.add(2.4);
		a.add(3.6);

		log.info("Before-------->" + a);

		double d = a.remove(3);
		log.info("Removed object is " + d);

		log.info("After-------->" + a);
	}

}
