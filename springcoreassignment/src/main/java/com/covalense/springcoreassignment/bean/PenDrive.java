package com.covalense.springcoreassignment.bean;

import com.covalense.springcoreassignment.interfaces.StorageDevice;

import lombok.Data;
import lombok.extern.java.Log;

@Data
@Log
public class PenDrive implements StorageDevice {
	private int capacity;
	private int writingSpeed;
	private int readingSpeed;

	public void read() {
		log.info("Content is reading from pendrive");

	}

	public void write() {
		log.info("Content is Writing to pendrive");

	}

	public void format() {
		log.info("pendrive is formatted");

	}

}
