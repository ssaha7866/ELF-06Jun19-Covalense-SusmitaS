package com.covalense.java.function;

import java.util.function.Function;

import lombok.extern.java.Log;
@Log
/**
 * WAP to find the area of a circle
 *
 */
public class FunctionTestOne {

	public static void main(String[] args) {
		Function<Double,Double> f=r->3.142*r*r;
		double x=f.apply(5.2);
		log.info(""+x);
	}

}
