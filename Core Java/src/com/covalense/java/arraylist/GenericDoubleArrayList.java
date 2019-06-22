package com.covalense.java.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

import lombok.extern.java.Log;

@Log
public class GenericDoubleArrayList {

	public static void main(String[] args) {
		ArrayList<Double> a = new ArrayList<Double>();
		a.add(5.11);
		a.add(2.03);
		a.add(5.20);
		a.add(9.99);

		// way 1
		ListIterator<Double> li = a.listIterator();
		log.info("----------forward------------");
		while (li.hasNext()) {
			Double d = li.next();
			log.info("" + d);
		}
		log.info("----------backward------------");
		while (li.hasPrevious()) {
			Double d = li.previous();
			log.info("" + d);
		}

		// way 3
		Iterator<Double> i = a.iterator();
		while (i.hasNext()) {
			Double d = i.next();
			log.info("" + d);
		}

		// way 2
		for (Double d : a) {
			log.info("" + d);
		}

		// way 1
		for (int i1 = 0; i1 < a.size(); i1++) {
			Double d = a.get(i1);
			log.info("" + d);
		}
	}

}
