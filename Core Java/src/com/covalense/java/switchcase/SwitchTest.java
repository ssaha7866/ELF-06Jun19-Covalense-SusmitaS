package com.covalense.java.switchcase;

import lombok.extern.java.Log;

@Log
public class SwitchTest {

	public static void main(String[] args) {
		String s="Apple";
		
		switch(s) {
		case "Apple": log.info("APPLE");
		break;
		
		case "Cat": log.info("CAT");
		break;
		}
	}

}
