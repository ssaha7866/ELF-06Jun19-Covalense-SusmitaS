package com.covalense.java.assignmentseven;

import java.util.Comparator;
import java.util.TreeSet;

import lombok.extern.java.Log;
@Log
/*
 * sorting the Product object by name,
 * using lambda with comparator
 */
public class TestProduct {
	public static void main(String[] args) {

		Product s1 = new Product( 21,"phone",803333);
		Product s2 = new Product( 20,"watch", 6233);
		Product s3 = new Product( 22,"tv", 773333);
		//sorting the Products by name 
		Comparator<Product> c2 = (e, f) -> e.pname.compareTo(f.pname);

		TreeSet<Product> ts = new TreeSet<>(c2);
		ts.add(s1);
		ts.add(s2);
		ts.add(s3);
       //printing the sorted data
		for (Product p : ts) {

			log.info("Product Name is " + p.pname);
			log.info("    id is " + p.pid);
			log.info("    price is " + p.price);
			log.info("*******");

		}//for end

	}//main end

}//class end
