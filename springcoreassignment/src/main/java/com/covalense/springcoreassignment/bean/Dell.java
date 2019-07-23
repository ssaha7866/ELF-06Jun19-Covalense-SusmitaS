package com.covalense.springcoreassignment.bean;

import org.springframework.beans.factory.annotation.Autowired;

import com.covalense.springcoreassignment.interfaces.Laptop;
import com.covalense.springcoreassignment.interfaces.StorageDevice;

import lombok.Data;
import lombok.extern.java.Log;

@Data
@Log
public class Dell implements Laptop {
	String brand = "dell inspiron x1";
	String color = "black";
	double cost = 200000.0;
	double weight = 2.3;
	int ram = 4;
	String os = "windows";
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
		device.read();
	}
}
