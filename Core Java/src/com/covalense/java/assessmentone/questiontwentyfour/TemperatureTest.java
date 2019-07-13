package com.covalense.java.assessmentone.questiontwentyfour;

import lombok.extern.java.Log;

@Log
public abstract class TemperatureTest {

	public static void main(String[] args) {
		
		Temperature temperature=new Temperature();
		try {
			temperature.check(28.2);
		}
		catch (HighTemperatureException e) {

			log.warning(""+e);
		}
		
		
	}

}
