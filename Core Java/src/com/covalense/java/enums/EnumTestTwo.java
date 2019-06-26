package com.covalense.java.enums;
import lombok.extern.java.Log;

@Log
public class EnumTestTwo {

	public static void main(String[] args) {
		Gender g=Gender.FEMALE;
		
		switch(g) {
		
		case MALE: log.info("this is MALE enum");
		break;
		
		case FEMALE: log.info("this is FEMALE enum");
		break;
		
		case OTHER: log.info("this is OTHER enum");
		break;
		}
	}

}
