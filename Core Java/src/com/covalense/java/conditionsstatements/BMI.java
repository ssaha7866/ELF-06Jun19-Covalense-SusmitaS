package com.covalense.java.conditionsstatements;

import lombok.extern.java.Log;

@Log
public class BMI {

	public static void main(String[] args) {
		double ht=5.5;
		double wt=60;
		double bmi=BMICal(ht,wt);
		type(bmi);
	}

	  static void type(double bmi) {
		  if(bmi<=18.5)
			  log.info(""+"UNDERWEIGHT");
		  else if(bmi<=24.9)
			  log.info(""+"NORMALWEIGHT");
		  else if(bmi<=29.9)
			  log.info(""+"OVERWEIGHT");
		  else
			  log.info(""+"OBESE");
	}

	static double BMICal(double ht, double wt) {
		 double res=wt/(ht*ht);
		 log.info(""+"BMI is "+ res);
		 return res;
	}
	 

}
