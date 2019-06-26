package com.covalense.java.enums;

import lombok.extern.java.Log;

@Log
public class EnumTest {

	public static void main(String[] args) {
		log.info(""+Gender.FEMALE.ordinal());
		log.info(""+Gender.MALE.ordinal());
		log.info(""+Gender.OTHER.ordinal());
	}

}
