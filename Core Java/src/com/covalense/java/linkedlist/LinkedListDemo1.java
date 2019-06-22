package com.covalense.java.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

import lombok.extern.java.Log;

@Log
public class LinkedListDemo1 {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		LinkedList l=new LinkedList();
		l.add(14);
		l.add(14.44);
		l.add('S');
		l.add("Susmita");
		l.add(null);
		l.add(true);
		
		for(int i=0;i<l.size();i++) {
			Object o=l.get(i);
			log.info(""+o);
		}
		
		log.info(""+"**********************Break******************");
		
		for (Object o : l) {
			log.info(""+o);
		}
		
		log.info(""+"***************************************************");
		
		Iterator i=l.iterator();
		while(i.hasNext()) {
			Object r=i.next();
			log.info(""+r);
		}
		
		log.info(""+"***************************************************");
		
		
		ListIterator li=l.listIterator();
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
		
	}

}
