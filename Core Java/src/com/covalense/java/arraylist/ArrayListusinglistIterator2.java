package com.covalense.java.arraylist;

import java.util.ArrayList;
import java.util.ListIterator;

import lombok.extern.java.Log;

@Log
public class ArrayListusinglistIterator2 {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		ArrayList a = new ArrayList();
		a.add(15);
		a.add(5.11);
		a.add("Susmita");
		a.add('D');
		a.add(true);
		a.add(null);

		ListIterator li = a.listIterator(3);
		log.info("----------backward------------");
		while (li.hasPrevious()) {
			Object o = li.next();
			log.info("value" + o);
		}
	}

}
