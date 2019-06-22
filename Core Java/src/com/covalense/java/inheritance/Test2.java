package com.covalense.java.inheritance;

import lombok.extern.java.Log;

@Log
public class Test2 {

	public static void main(String[] args) {
		LevelOne l1=new LevelOne();
		LevelTwo l2=new LevelTwo();
		LevelThree l3=new LevelThree();
		l1.show1();
		
		log.info("**********************");
		l2.show1();
		l2.show2();
		
		log.info("********************");
		l3.show1();
		l3.show2();
		l3.show3();
	}

}
