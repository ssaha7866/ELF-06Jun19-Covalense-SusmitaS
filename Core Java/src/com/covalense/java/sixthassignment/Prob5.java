package com.covalense.java.sixthassignment;

import lombok.extern.java.Log;

@Log
/*
 * lambda expression to print numbers of given range
 */
public class Prob5{
	
public static void main(String[] args) {

	PrintNum p = (a,b)->{
		for(int i=a;i<b;i++) {
		log.info(""+i);	
		}
return b;	
		
	};
	int result = p.num(5, 20);
	log.info(""+result);
}


}
