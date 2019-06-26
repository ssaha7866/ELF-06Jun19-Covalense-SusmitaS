package com.covalense.java.supplier;

import java.util.function.Supplier;

import lombok.extern.java.Log;

@Log
public class GunTest {

	public static void main(String[] args) {
		Supplier<Gun> c=()->new Gun(100);
		Gun g=c.get();
		log.info(""+g.bullet);
	}

}
