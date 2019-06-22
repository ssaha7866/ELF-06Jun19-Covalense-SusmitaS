package com.covalense.java.constructor;
import lombok.extern.java.Log;

@Log
class Animal
{
	
	void eat()
	{
		log.info(""+"Aminal eats");
	}
}

@Log
class Cow extends Animal
{
	@Override
	void eat()
	{
		log.info(""+"Cow eats");
	}
}

@Log
class Lion extends Animal
{
	@Override
	void eat()
	{
		log.info(""+"Lion eats");
	}
}
public class Test6 {
	static Animal a;
	public static void main(String[] args) {
		a.eat();
	}

}
