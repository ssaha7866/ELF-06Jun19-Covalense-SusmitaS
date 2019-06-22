package com.covalense.java.incrementdecrement;

import lombok.extern.java.Log;

@Log
public class demo {
	public static void main(String[] args) {
		int a=5;
		int b=10;
		int c=--b+--a + ++a- ++b - a-- + ++b;
		log.info(""+a);
		log.info(""+b);
		log.info(""+c);
		byte a1=1;
		byte b1=1;
		log.info(""+a1+b1);
	}
}
