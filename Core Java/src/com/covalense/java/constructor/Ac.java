package com.covalense.java.constructor;

import lombok.extern.java.Log;

@Log

public class Ac { 
	public Ac(int x) {
		log.info(""+"PARAMETERISED CONSTRUCTOR");
	}

	public Ac(double d) {
		log.info(""+"Double value in parameter");
	}
}
