package com.covalense.java.methodrefdoublecolon;

import lombok.extern.java.Log;

@Log
public class MyStudent {
	
	void calculateAvg(int a,int b,int c) {
		double r=(a+b+c)/3.0;
		log.info("Average is "+r);
	}
	
	int fac(int a) {
		return 120;
	}

}
