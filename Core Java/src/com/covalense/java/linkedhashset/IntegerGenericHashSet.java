package com.covalense.java.linkedhashset;

import java.util.Iterator;
import java.util.LinkedHashSet;

import lombok.extern.java.Log;

@Log
public class IntegerGenericHashSet {

	public static void main(String[] args) {
		LinkedHashSet<Integer> lh=new LinkedHashSet<Integer>();
		lh.add(14);
		lh.add(16);
		lh.add(44);
		lh.add(20);
		lh.add(67);
		lh.add(90);
		
		
		for (Integer in : lh) {
			log.info(""+in);
		}
		
		log.info(""+"***************************************************");
		
		Iterator<Integer> i=lh.iterator();
		while(i.hasNext()) {
			Integer in=i.next();
			log.info(""+in);
		}
		
	}

}
