package com.covalense.java.thirdassignment;

import lombok.extern.java.Log;

@Log
public class Question2 {

	public static void main(String[] args) {
		Product s1 = new Product();

		s1.setName("Geetha");
		s1.setId(20);
		s1.setCost(90000);

		Product s2 = new Product();

		s2.setName("Rita");
		s2.setId(22);
		s2.setCost(19000);

		Product s3 = new Product();

		s3.setName("Sita");
		s3.setId(25);
		s3.setCost(60000);

		Product s4 = new Product();

		s4.setName("Amithabh");
		s4.setId(29);
		s4.setCost(1);

		Product s[] = new Product[4];
		s[0] = s1;
		s[1] = s2;
		s[2] = s3;
		s[3] = s4;
		for (int i = 0; i < 4; i++) {
			log.info("Name is " + s[i].getName());
			log.info("Age is " + s[i].getId());
			log.info("Roll is " + s[i].getCost());
		}
	}

}
