package com.covalense.java.vectors;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

import lombok.extern.java.Log;

@Log
public class IntegerGenericVector {

	public static void main(String[] args) {
		Vector <Integer> v=new Vector <Integer>();
		v.add(14);
		v.add(16);
		v.add(44);
		v.add(20);
		v.add(67);
		v.add(90);
		
		for(int k=0;k<v.size();k++) {
			Integer in=v.get(k);
			log.info(""+in);
		}
		
		log.info("******************************************************");
		
		for (Integer in : v) {
			log.info(""+in);
		}
		
		log.info("******************************************************");
		
		Iterator<Integer> i=v.iterator();
		while(i.hasNext()) {
			Integer in=i.next();
			log.info(""+in);
		}
		
		log.info(""+"***************************************************");
		
		Enumeration<Integer>e=v.elements();
		while(e.hasMoreElements()) {
			Integer in=e.nextElement();
			log.info(""+in);
		}
		
		log.info(""+"***************************************************");
		
		ListIterator<Integer> li=v.listIterator();
		log.info(""+"----------forward------------");
		while(li.hasNext()) {
			Integer in=li.next();
			log.info(""+in);
		}
		log.info(""+"----------backward------------");
		while(li.hasPrevious()) {
			Integer in=li.previous();
			log.info(""+in);
		}
	}// end of main

}// end of class
