package com.covalense.java.thread;

public class MarkerTest {

	public static void main(String[] args) {
		
		Marker m1=new Marker();
		
		Thread t1=new Thread(m1);
		t1.start();
		
		
	}

}
