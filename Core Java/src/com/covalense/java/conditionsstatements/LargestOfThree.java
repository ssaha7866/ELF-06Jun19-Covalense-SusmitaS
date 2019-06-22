package com.covalense.java.conditionsstatements;

import lombok.extern.java.Log;

@Log
public class LargestOfThree {

	public static void main(String[] args) {
		int n1=100,n2=100,n3=301;
		int lar=n1;
		if(n2>lar) {
			lar=n2;
		}
		 if(n3>lar) {
			lar=n3;
		 }
		log.info(""+lar);
		
	}
	
	

}
