package com.covalense.java.sixthassignment;

import lombok.extern.java.Log;

@Log
/*
 * lambda expression to find factorial
 */
public class Prob2 {
	
  public static void main(String[] args) {
	Factorial f= a->{
		int k=1;
		for(int i=1;i<=a;i++) {
			k=k*i;
		}
		return k;
	};
	int result = f.fact(5);
	log.info(""+result);
}



}
