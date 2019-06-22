package com.covalense.java.exceptions;


public class ValidateString {

	String name;
	void show(String nam)
	{
		  name=nam;                                                    
	if(name.length()<5)
	{
		throw new InvalidNameException("length of given String is less than 5");
	}
	}
}
