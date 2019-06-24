package com.covalense.java.predicate;

import java.util.function.Predicate;

import lombok.extern.java.Log;
@Log
/**
 * taking integer array type object in the predicate and return the number which is greater than 4
 *
 */
public class PredicateTestFour {

	public static void main(String[] args) {

		int[] ar= {2,5,9,6,4,3};
		Predicate<Integer> p=a-> a>4;
		for(int i=0;i<ar.length;i++) {
			if(p.test(ar[i])) {
				log.info(""+ar[i]);
			}//if ends
			}//loop ends
	}//main ends

}//class ends
