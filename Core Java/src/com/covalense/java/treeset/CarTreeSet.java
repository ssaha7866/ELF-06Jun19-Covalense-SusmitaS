package com.covalense.java.treeset;

import java.util.TreeSet;

import lombok.extern.java.Log;

@Log
public class CarTreeSet {

	public static void main(String[] args) {
		TreeSet<Car> ct = new TreeSet<Car>();

		Car c1 = new Car();
		c1.name = "Audi Type A";
		c1.brand = "Audi";
		c1.cost = 40000;
		c1.rating = 3.2;

		Car c2 = new Car();
		c2.name = "BMW IIIa";
		c2.brand = "bmw";
		c2.cost = 1000;
		c2.rating = 4.2;

		Car c3 = new Car();
		c3.name = "Phantom Coupe";
		c3.brand = "rolls-royce";
		c3.cost = 35000;
		c3.rating = 4.5;

		Car c4 = new Car();
		c4.name = " B-Class Electric Drive";
		c4.brand = "mercedes-benz";
		c4.cost = 500;
		c4.rating = 5.0;

		ct.add(c1);
		ct.add(c2);
		ct.add(c3);
		ct.add(c4);

		log.info(""+"**************FOR EACH LOOP******************");
		log.info("");

		for (Car c : ct) {
			log.info(""+"Name is " + c.name);
			log.info(""+"Brand is " + c.brand);
			log.info(""+"Id is " + c.cost);
			log.info(""+"Percentage is " + c.rating);
			log.info("");
		}
	}

}
