package com.covalense.java.extras;

import lombok.extern.java.Log;

@Log
public class TryCatch {

	public static void main(String[] args) {
		//creating an exception to use multiple catch block using | operator
		try {
		@SuppressWarnings("unused")
		int c=2/0;
		}
		catch(ArithmeticException | NullPointerException e) {
			log.warning("Exception"+e.getMessage());
		}
		catch(Exception e) {
			log.warning("Exception");
		}
		
		
	}

}
