package com.covalense.java.objectcreation;

import lombok.extern.java.Log;

@Log
public class Test6 {

	public static void main(String[] args) {
		Card j=new Card();
		Card a=new Card();
		j.swipe();
		j.swipe();
		a.swipe();
		a.swipe();
		a.swipe();
		log.info("NUMBER OF STUDENTS IN JAVA CLASS "+ j.count);
		log.info("NUMBER OF STUDENTS IN ANGULAR CLASS "+ a.count);
		log.info("TOTAL NUMBER OF STUDENTS "+ Card.orgCount);
	}

}
