package com.covalense.java.conditionsstatements;
import lombok.extern.java.Log;

public class Test2 {

	public static void main(String[] args) {
		Car c=new Car();
		c.color="RED";
		c.cost=5000000;
		c.drive();
	}

}


@Log
class Car
{
	int cost;
	String color;
	void drive()
	{
		log.info(""+"I am driving the car");
	}
}
