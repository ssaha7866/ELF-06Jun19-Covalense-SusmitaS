package com.covalense.java.treeset;

import java.util.TreeSet;

import lombok.extern.java.Log;

@Log
public class ProductTreeSet {

	public static void main(String[] args) {
		TreeSet<Product> pt=new TreeSet<Product>();
		
		Product p1=new Product();
		p1.name="iphone";
		p1.cost=40000;
		p1.rating=3.2;
		
		Product p2=new Product();
		p2.name="bedsheet";
		p2.cost=1000;
		p2.rating=4.2;

		Product p3=new Product();
		p3.name="sofa";
		p3.cost=35000;
		p3.rating=4.5;

		Product p4=new Product();
		p4.name="cosmetics";
		p4.cost=500;
		p4.rating=5.0;
		
		pt.add(p1);
		pt.add(p2);
		pt.add(p3);
		pt.add(p4);
		
		log.info(""+"**************FOR EACH LOOP******************");
		for(Product p:pt) {
		log.info(""+"Name is "+p.name);
		log.info(""+"Id is "+p.cost);
		log.info(""+"Percentage is "+p.rating);
		}
		
	}

}
