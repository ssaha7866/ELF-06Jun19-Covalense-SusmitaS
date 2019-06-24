package com.covalense.java.predicate;

import java.util.function.Predicate;

import lombok.extern.java.Log;
@Log
/**
 * taking String type object in the predicate and return if the length is even or odd
 *
 */
public class PredicatetestTwo {

	public static void main(String[] args) {
		
		Predicate<String>s=str->str.length()%2==0;
		boolean b=s.test("hi how are you doing");
		log.info(""+b);
	}

}
