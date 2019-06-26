package com.covalense.java.constructorrefdoublecolon;

import lombok.extern.java.Log;

@Log
public class BoyTest {

	public static void main(String[] args) {
		MyBoy mb=Boy ::new;
		
		Boy b1=mb.getBoy("ramu",5.5,19);
		log.info(""+b1.name);
		log.info(""+b1.age);
		log.info(""+b1.ht);
		
	}

}
