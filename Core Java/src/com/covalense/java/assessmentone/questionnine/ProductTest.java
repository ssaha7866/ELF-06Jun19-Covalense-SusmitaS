package com.covalense.java.assessmentone.questionnine;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import lombok.extern.java.Log;
@Log
public class ProductTest {

	public static void main(String[] args) {
		
		ArrayList<Product> products=new ArrayList<>();
		products.add(new Product(1,"mobile",50000,"iPhone"));
		products.add(new Product(2,"car",4000000,"bmw"));
		products.add(new Product(1,"mobile",10000,"lenovo phone"));
		products.add(new Product(1,"mobile",20000,"asus Phone"));
		products.add(new Product(2,"car",50000000,"lamborgini"));
		products.add(new Product(2,"car",424000000,"rolls royce"));
		products.add(new Product(1,"mobile",70000,"samsung Phone"));
		products.add(new Product(2,"car",40000,"mercedes benz"));
		
		//getting product list by the given type
		String productTypeChoice="car";
		
		List<Product> listByType=products.stream().filter(i->i.productType.equals(productTypeChoice)).collect(Collectors.toList());
		log.info("LIST OF PRODUCTS BY THE TYPE "+productTypeChoice+" IS ");
		for(Product product:listByType) {
			log.info(""+product.productName);
		}

		// getting product list by the given range
		int startRange=10000;
		int endRange=300000;
		List<Product> listByRange=products.stream().filter(i->i.productCost>=startRange && i.productCost<=endRange).collect(Collectors.toList());
		log.info("LIST OF PRODUCTS BY THE RANGE "+startRange+" TO "+endRange+" IS ");
		for(Product product:listByRange) {
			log.info(""+product.productName);
		}//for to print product list by range
	}//end of main
	
}//end of class
