package com.covalense.java.predicate;

import java.util.function.Predicate;

import lombok.extern.java.Log;
@Log
/**
 * taking integer type object in the predicate and return whether its odd or even
 *
 */
public class PredicateTest {

	public static void main(String[] args) {
		Predicate<Integer> p=a-> a%2==0;
		boolean x=p.test(15);
		log.info(""+x);
	}

}
