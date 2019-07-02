package com.covalense.java.methodrefdoublecolon;

import lombok.extern.java.Log;

@Log
public class RoomTest {

	static void open() {
		log.info("open method");
	}
	
	public static void main(String[] args) {
		Room r=RoomTest::open;
		r.move();
				}
}
