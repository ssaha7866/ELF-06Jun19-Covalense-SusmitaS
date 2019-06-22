package com.covalense.java.lamdaexpression;

import lombok.extern.java.Log;

@Log
public class TestCalssForSquare {

	public static void main(String[] args) {
		Square s = n -> n * n;
		int res=s.sq(5);
		log.info(""+res);
	}

}
