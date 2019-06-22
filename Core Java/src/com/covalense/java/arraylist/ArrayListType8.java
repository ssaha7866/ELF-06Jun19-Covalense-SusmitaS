package com.covalense.java.arraylist;

import java.util.ArrayList;

import lombok.extern.java.Log;

@Log
public class ArrayListType8 {

	public static void main(String[] args) {
		ArrayList<Double> a = new ArrayList<Double>();
		a.add(9.2);
		a.add(1.5);
		a.add(6.9);
		a.add(2.4);
		a.add(3.6);

		log.info("Before-------->" + a);

		log.info("After-------->" + a);
	}

}
