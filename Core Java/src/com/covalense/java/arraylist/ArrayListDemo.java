package com.covalense.java.arraylist;

import java.util.ArrayList;

import lombok.extern.java.Log;

@Log
public class ArrayListDemo {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		ArrayList a = new ArrayList();
		a.add(15);
		a.add(5.11);
		a.add("Susmita");
		a.add('D');
		a.add(true);
		a.add(null);
		for (int i = 0; i < a.size(); i++) {
			Object o = a.get(i);
			log.info("values" + o);
		}

	}

}
