package com.covalense.java.extras;

import lombok.extern.java.Log;

@Log
public class TryCatch {

	public static void main(String[] args) {
		
		try {
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
