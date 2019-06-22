package com.covalense.java.conditionsstatements;

import lombok.extern.java.Log;

@Log
public class BMI1 {

	double wt;
	double ht;
	double calcBMI()
	{
		double bmi=wt/(ht*ht);
		log.info(""+bmi);
		return bmi;
	}
	void detimineBMI(double bmi)
	{
		if(bmi<=18.5)
			  log.info(""+"UNDERWEIGHT");
		  else if(bmi<=24.9)
			  log.info(""+"NORMALWEIGHT");
		  else if(bmi<=29.9)
			  log.info(""+"OVERWEIGHT");
		  else
			  log.info(""+"OBESE");
	}

}
