package com.covalense.java.sixthassignment;

import lombok.extern.java.Log;
@Log
/*
 * lambda expression to print a message
 */
public class Prob3  {

	public static void main(String[] args) {
		Message m=s->
		log.info(""+s);
		
		m.mesg("This is my message");
	}

	
}
