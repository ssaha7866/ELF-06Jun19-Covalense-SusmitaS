package com.covalense.java.annotation;

import lombok.extern.java.Log;

@Log
public class AnnotationDemo {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		int a;
		int b = 5;
		log.info("array" + b);

		Mouse m = new Mouse();
		m.scroll();// gives warning which is suppressed using annotation
	}

}
