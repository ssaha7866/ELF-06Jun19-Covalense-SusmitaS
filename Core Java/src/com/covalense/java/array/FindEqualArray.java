package com.covalense.java.array;

import java.util.Arrays;

import lombok.extern.java.Log;

@Log
public class FindEqualArray {

	public static void main(String[] args) {
		int ar[] = { 9, 6, 2, 4 };
		int copy[] = Arrays.copyOf(ar, ar.length);
		String s = Arrays.toString(copy);
		s = s.replaceAll(",", " ");
		s = s.replace("[", " ");
		s = s.replace("]", " ");
		log.info("value" + s);
	}

}
