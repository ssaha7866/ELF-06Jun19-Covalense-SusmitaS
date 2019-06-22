package com.covalense.java.conditionsstatements;

public class Test4 {

	public static void main(String[] args) {
		BMI1 bmi=new BMI1();
		bmi.ht=1275;
		bmi.wt=65.5;
		double b=bmi.calcBMI();
		bmi.detimineBMI(b);
		
	}

}
