package com.covalense.java.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

import lombok.extern.java.Log;

@Log
public class GenericIntLinkedList {

	public static void main(String[] args) {
		LinkedList<Integer> l=new LinkedList<Integer>();
		l.add(14);
		l.add(16);
		l.add(44);
		l.add(20);
		l.add(67);
		l.add(90);
		
		for(int k=0;k<l.size();k++) {
			Integer in=l.get(k);
			log.info(""+in);
		}
		
		log.info(""+"*****************Break***************************");
		
		for (Integer in : l) {
			log.info(""+in);
		}
		
		log.info(""+"***************************************************");
		
		Iterator<Integer> i=l.iterator();
		while(i.hasNext()) {
			Integer in=i.next();
			log.info(""+in);
		}
		
		log.info(""+"***************************************************");
		
		
		ListIterator<Integer> li=l.listIterator();
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
	}

}
