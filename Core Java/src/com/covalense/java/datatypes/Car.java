package com.covalense.java.datatypes;

import lombok.extern.java.Log;

@Log
public class Car {

	public static void main(String[] args) {
		int ex=570000;
		log.info(""+"Ex-showroom price(incl. GST) "+ex);
		double rto=(ex*14.26)/100;
		log.info(""+"RTO "+rto);
		double inc=(ex*9.76)/100;
		log.info(""+"Insurance "+inc);
		double onRoad=ex+rto+inc;
		log.info(""+"On-road Price(Basic) "+ onRoad);
	}

}
