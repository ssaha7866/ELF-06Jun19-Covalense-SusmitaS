package com.covalense.springcoreassignment.config;

import org.springframework.context.annotation.Bean;

import org.springframework.context.annotation.Configuration;

import com.covalense.springcoreassignment.bean.Dell;
import com.covalense.springcoreassignment.bean.HardDisk;
import com.covalense.springcoreassignment.interfaces.Laptop;
import com.covalense.springcoreassignment.interfaces.StorageDevice;

@Configuration
public class LaptopConfig {
	@Bean
	public Laptop getLaptop() {
		return new Dell();
	}

	@Bean
	public StorageDevice getStorageDevice() {
		return new HardDisk();
	}

}
