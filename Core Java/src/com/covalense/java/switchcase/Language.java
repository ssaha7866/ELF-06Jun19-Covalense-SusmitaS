package com.covalense.java.switchcase;

import lombok.extern.java.Log;

@Log
public class Language {

	public static void main(String[] args) {
		int press = 1;
		switch (press) {
		case 1:
			log.info(""+"Selected language is Kannada");
			break;
		case 2:
			log.info(""+"Selected language is English");
			break;
		case 3:
			log.info(""+"Selected language is Hindi");
			break;
		case 4:
			log.info(""+"Selected language is Tamil");
			break;
		default:
			log.info(""+"Invalid Input");
		}
	}

}
