package com.covalense.java.inheritance;

import lombok.extern.java.Log;

@Log
public class ScientificCalc extends Calculator{
	void sin()
	{
		log.info(""+"FIND SINE");
	}
	void log()
	{
		log.info(""+"FIND LOGARITHM");
	}
	void cos()
	{
		log.info(""+"FIND COSINE");
		
	}
	

}
