package com.covalense.java.predicate;

import java.util.function.Predicate;

import lombok.extern.java.Log;
@Log
/**
 * taking integer array type object in the predicate and return the number if it is odd
 *
 */
public class PredicateTestThree {

	public static void main(String[] args) {
		
		int[] ar= {2,5,9,6,4,3};
		Predicate<Integer> p=a-> a%2==1;
		
		for(int i=0;i<ar.length;i++) {
			if(p.test(ar[i])) {
				log.info(""+ar[i]);
			}
	}
	}
	
}
