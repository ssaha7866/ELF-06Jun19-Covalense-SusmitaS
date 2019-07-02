package com.covalense.java.dateandtime;

import java.time.LocalDate;

import lombok.extern.java.Log;
@Log
public class DateTest {

	public static void main(String[] args) {
		
		
		
		LocalDate a= LocalDate.now();
		log.info(""+a);
	}

}
