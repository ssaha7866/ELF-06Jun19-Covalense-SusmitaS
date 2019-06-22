package com.covalense.java.constructor;

import lombok.extern.java.Log;

@Log
public class Test11 {
	public static void main(String[] args) {

		Machine m = new Machine();
		ICICI i = new ICICI();
		HDFC h = new HDFC();
		SBI s=new SBI();
		m.slot(i);
		log.info("");
		
		m.slot(h);
		log.info("");
		
		m.slot(s);
		log.info("");
	}
}
