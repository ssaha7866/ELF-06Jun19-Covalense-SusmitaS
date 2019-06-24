package com.covalense.java.function;

import java.util.function.Function;

import lombok.extern.java.Log;
@Log
/**
 * WAP to find square of a number
 *
 */
public class FunctionTest2 {

	public static void main(String[] args) {
		Function<Double,Double> f=r->r*r;
		double x=f.apply(5.2);
		log.info(""+x);
	}

}
