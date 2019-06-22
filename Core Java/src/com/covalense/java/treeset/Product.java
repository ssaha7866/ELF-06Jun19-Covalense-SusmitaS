package com.covalense.java.treeset;

public class Product implements Comparable<Product> {
	String name;
	int cost;
	double rating;
	@Override
	public int compareTo(Product p) {
		Double tp=this.rating;
		Double pp=p.rating;
		return (tp.compareTo(pp)*-1);
	}
	

}
