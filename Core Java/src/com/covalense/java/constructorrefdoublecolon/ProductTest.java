package com.covalense.java.constructorrefdoublecolon;

import lombok.extern.java.Log;

@Log
public class ProductTest {

	public static void main(String[] args) {
		MyProduct mp=Product::new;
		
		Product p1=mp.getProduct("mobile", 20000);
				log.info(""+p1.name);
				log.info(""+p1.cost);
	}

}
