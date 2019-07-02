package com.covalense.java.dateandtime;

import java.time.LocalDate;
import java.time.Period;

import lombok.extern.java.Log;
@Log
public class BirthDate {

	public static void main(String[] args) {
		
		LocalDate bir=LocalDate.of(1947, 8, 15);
		LocalDate cur=LocalDate.now();
		Period p=Period.between(bir, cur);
		log.info(""+p);
	}

}
