package com.covalense.java.arraylist;

import java.util.ArrayList;

import lombok.extern.java.Log;

@Log
public class GenericStringArrayList {

	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList<String>();
		a.add("Ms.");
		a.add("Susmita");
		a.add(" ");
		a.add("Saha");

		for (String s : a) {
			log.info("" + s);
		}
		log.info("");
	}

}
