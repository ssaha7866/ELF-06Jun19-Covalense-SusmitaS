package com.covalense.java.datatypes;

import lombok.extern.java.Log;

@Log
public class BMICal {

	public static void main(String[] args) {
		double wt=65.1;
		double ht=5.5;
		log.info(""+"BMI is "+(wt/(ht*ht)));
	}

}
