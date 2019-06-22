package com.covalense.java.datatypes;

import lombok.extern.java.Log;

@Log
public class Percentage {

	public static void main(String[] args) {
		double m1=72;
		double totM=80;
		double per=per(m1,totM);
		log.info(""+per+"%");
	}

	 static double per(double m1, double totM) {
		
		 return (m1*100)/totM;
	}

}
