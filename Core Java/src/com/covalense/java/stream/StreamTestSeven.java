package com.covalense.java.stream;

import java.util.stream.Stream;

public class StreamTestSeven {

	public static void main(String[] args) {

		/*
		 * Integer[] a = { 5, 6, 4, 1, 2 };
		 * Stream can take array also
		 */
		Stream<Integer> s = Stream.of(9,5,7,4,1,2);//stream can take a group of values also
		s.forEach(System.out::println);//example to refer predefined println method instead of using lambda expression

	}

}
