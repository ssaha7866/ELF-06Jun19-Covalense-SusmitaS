package com.covalense.java.assignmenttwo;


import lombok.extern.java.Log;

@Log
public class Employee {

	static void search(int id) {
		log.info(""+"searching by Employee Id ");

	}

 static	void search(String name) {
		log.info(""+"searching by Employee name");
	}
	

	public static void main(String[] args) {
		
		search("n");

	}

}
