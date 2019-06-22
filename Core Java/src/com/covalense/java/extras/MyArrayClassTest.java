package com.covalense.java.extras;

import lombok.extern.java.Log;
@Log
public class MyArrayClassTest {
	
	public static void main(String[] args) {
		
		long start=System.currentTimeMillis();
		
		
		MyArrayClass m = new MyArrayClass();
		int dataSize=11;
		
		
		// adding the values
		for (int i = 0; i < dataSize; i++) {
			m.add("Values " + i);
		}
		
		
		//removing value
		log.info("removing at position 2");
		m.remove(10);
		for (int i = 0; i < dataSize; i++) {
			log.info("The element at position " + i + " is : " + m.get(i));
		}
		
		//calculating time
		long end=System.currentTimeMillis();
		long timeElapsed= start-end;
		
		log.info("Total time taken is "+ timeElapsed);
		
	}// main class ends

}
