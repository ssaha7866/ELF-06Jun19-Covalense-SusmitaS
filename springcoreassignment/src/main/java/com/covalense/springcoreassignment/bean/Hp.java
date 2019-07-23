package com.covalense.springcoreassignment.bean;
import org.springframework.beans.factory.annotation.Autowired;

import com.covalense.springcoreassignment.interfaces.Laptop;
import com.covalense.springcoreassignment.interfaces.StorageDevice;

import lombok.Data;
import lombok.extern.java.Log;

@Data
@Log
public class Hp implements Laptop {
	String brand;
	String color;
	double cost;
	double weight;
	int ram;
	String os;
	@Autowired
	StorageDevice device;
	public void display() {

	}

	public void process() {

	}
	public void showSpecification() {

		log.info("" + getBrand());
		log.info("" + getColor());
		log.info("" + getCost());
		log.info("" + getRam());
		log.info("" + getWeight());
		log.info("" + getOs());

	}
}
