package com.covalense.java.treeset;

import java.util.Iterator;
import java.util.TreeSet;

import lombok.extern.java.Log;

@Log
public class IntegerGenericTreeSet {

	public static void main(String[] args) {
		TreeSet <Integer> t=new TreeSet <Integer>();
		t.add(14);
		t.add(16);
		t.add(44);
		t.add(20);
		t.add(67);
		t.add(90);
		
		
		for (Integer in : t) {
			log.info(""+in);
		}
		
		log.info(""+"***************************************************");
		
		Iterator<Integer> i=t.iterator();
		while(i.hasNext()) {
			Integer in=i.next();
			log.info(""+in);
		}
		
	}

}
