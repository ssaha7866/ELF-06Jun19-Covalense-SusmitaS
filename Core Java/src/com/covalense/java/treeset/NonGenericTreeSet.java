package com.covalense.java.treeset;

import java.util.Iterator;
import java.util.TreeSet;

import lombok.extern.java.Log;

@Log
public class NonGenericTreeSet {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		TreeSet t=new TreeSet();
		t.add(14);
		t.add(15);
		t.add(3);
		t.add(7);
		t.add(66);
		t.add(555);
		
		
		
		for (Object o : t) {
			log.info(""+o);
		}
		
		log.info(""+"***************************************************");
		
		Iterator i=t.iterator();
		while(i.hasNext()) {
			Object r=i.next();
			log.info(""+r);
		}
	}

}
