package com.covalense.java.vectors;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

import lombok.extern.java.Log;

@Log
public class NonGenericVector {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		Vector v=new Vector();
		v.add(14);
		v.add(14.44);
		v.add('S');
		v.add("Susmita");
		v.add(null);
		v.add(true);
		
		for(int i=0;i<v.size();i++) {
			Object o=v.get(i);
			log.info(""+o);
		}
		
		log.info(""+"***************************************************");
		
		for (Object o : v) {
			log.info(""+o);
		}
		
		log.info(""+"***************************************************");
		
		Iterator i=v.iterator();
		while(i.hasNext()) {
			Object r=i.next();
			log.info(""+r);
		}
		
		log.info(""+"***************************************************");
		
		
		Enumeration e=v.elements();
		while(e.hasMoreElements()) {
			Object o=e.nextElement();
			log.info(""+o);
		}
		
		log.info(""+"***************************************************");
		
		ListIterator li=v.listIterator();
		log.info(""+"----------forward------------");
		while(li.hasNext()) {
			Object o=li.next();
			log.info(""+o);
		}
		log.info(""+"----------backward------------");
		while(li.hasPrevious()) {
			Object o=li.previous();
			log.info(""+o);
		}
	}// end of main

}// end of class
