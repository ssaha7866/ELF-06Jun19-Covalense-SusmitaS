package com.covalense.java.dateandtime;

import java.time.LocalDate;
import java.time.Period;

import lombok.extern.java.Log;
@Log
public class BirthDeath {

	public static void main(String[] args) {

		LocalDate bir=LocalDate.of(1995, 8, 15);
		LocalDate dead=LocalDate.now();
		
		Period p=Period.between(bir, dead);
		int total=p.getYears()*365+p.getMonths()*30+p.getDays();
		log.info(""+total);
	}

}
