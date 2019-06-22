package com.covalense.java.inheritance;

import lombok.extern.java.Log;

@Log
public class Animal {
	int i;
	void walk() {
		log.info(""+"I AM WALK() METHOD");
	
	}
}


@Log
class Cow extends Animal
{
	int r;
	void eat() {
		log.info(""+"I AM EAT() METHOD");
		
	}
}