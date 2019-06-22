package com.covalense.java.hashset;

import java.util.HashSet;
import java.util.Iterator;

import lombok.extern.java.Log;

@Log
public class IntegerGenericHashSet {

	public static void main(String[] args) {
		HashSet <Integer> h=new HashSet <Integer>();
		h.add(14);
		h.add(16);
		h.add(44);
		h.add(20);
		h.add(67);
		h.add(90);
		
		
		for (Integer in : h) {
			log.info(""+in);
		}
		
		log.info(""+"***************************************************");
		
		Iterator<Integer> i=h.iterator();
		while(i.hasNext()) {
			Integer in=i.next();
			log.info(""+in);
		}
		
	}

}
