package com.covalense.java.lamdaexpression;

import lombok.extern.java.Log;

@Log
public class TestClassForInteface {

	public static void main(String[] args) {
		Sum s=(n1,n2)->n1+n2;
		int i=s.add(5,6);
		log.info(""+i);
	}

}
