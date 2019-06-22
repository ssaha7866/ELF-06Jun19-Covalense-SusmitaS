package com.covalense.java.hashset;

import java.util.HashSet;
import java.util.Iterator;

import lombok.extern.java.Log;
@Log
public class NonGenericHashSet {
@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		HashSet h=new HashSet();
		h.add(14);
		h.add(14.44);
		h.add('S');
		h.add("Susmita");
		h.add(null);
		h.add(true);
		
		
		
		for (Object o : h) {
			log.info(""+o);
		}
		
		log.info(""+"***************************************************");
		
		Iterator i=h.iterator();
		while(i.hasNext()) {
			Object r=i.next();
			log.info(""+r);
		}
	}

}
