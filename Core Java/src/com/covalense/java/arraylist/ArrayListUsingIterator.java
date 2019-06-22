package com.covalense.java.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

import lombok.extern.java.Log;

@Log
public class ArrayListUsingIterator {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		ArrayList a = new ArrayList();
		a.add(15);
		a.add(5.11);
		a.add("Susmita");
		a.add('D');
		a.add(true);
		a.add(null);

		Iterator i = a.iterator();
		while (i.hasNext()) {
			Object r = i.next();
			log.info("value" + r);
		}
	}

}
