package com.covalense.java.dateandtime;

import java.time.ZoneId;
import java.time.ZonedDateTime;

import lombok.extern.java.Log;
@Log
public class ZoneDateTimeTest {

	public static void main(String[] args) {
		
		ZoneId z=ZoneId.systemDefault();
		log.info(""+z);
		ZoneId z1=ZoneId.of("Australia/Sydney");
		ZonedDateTime z2=ZonedDateTime.now(z1);
		log.info(""+z2);
		
	}

}
