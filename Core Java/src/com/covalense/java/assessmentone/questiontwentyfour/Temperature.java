package com.covalense.java.assessmentone.questiontwentyfour;

public class Temperature {

	double temperature;
	
	void check(double temperature) {
		
		this.temperature=temperature;
		if(temperature>18) {
			throw new HighTemperatureException("Temperature has raised above 18");
		}
	}
}
