package com.covalense.java.datatypes;

import lombok.extern.java.Log;

@Log
public class AvgCalc {
	public static void main(String[] args) {
		int m1=10;
		int m2=20;
		int m3=35;
		log.info(""+"The avg marks is "+((m1+m2+m3)/3.0));
	}

}
