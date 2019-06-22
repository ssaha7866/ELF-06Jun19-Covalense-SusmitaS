package com.covalense.java.sixthassignment;

import lombok.extern.java.Log;

@Log
/*
 * lambda expression to find square of a number
 */
public class Prob4  {
	public static void main(String[] args) {
		Square sq = a -> a * a;
		int result = sq.squareofnum(6);
		log.info(""+result);
	}

	
	}

