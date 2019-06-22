package com.covalense.java.basics;

public class Marker {
	private static final Marker m = new Marker();

	private Marker() {

	}

	public static Marker getMarker() {
		return m;
	}
}
