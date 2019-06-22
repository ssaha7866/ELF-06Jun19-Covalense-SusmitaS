package com.covalense.java.linkedhashset;

import java.util.Iterator;
import java.util.LinkedHashSet;

import lombok.extern.java.Log;

@Log
public class NonGenericHashSet {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		LinkedHashSet lh=new LinkedHashSet();
		lh.add(14);
		lh.add(14.44);
		lh.add('S');
		lh.add("Susmita");
		lh.add(null);
		lh.add(true);
		
		
		
		for (Object o : lh) {
			log.info(""+o);
		}
		
		log.info(""+"***************************************************");
		
		Iterator i=lh.iterator();
		while(i.hasNext()) {
			Object r=i.next();
			log.info(""+r);
		}
	}

}
