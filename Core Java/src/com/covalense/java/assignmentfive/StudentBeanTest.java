/*
 * Creating 5 student bean objects and storing in arraylist
 */
package com.covalense.java.assignmentfive;

import java.util.ArrayList;
import java.util.logging.Logger;

public class StudentBeanTest {

private static final Logger log=Logger.getLogger("bhavani");

	public static void main(String[] args) {
		ArrayList<StudentBeanClass> a = new ArrayList<StudentBeanClass>();
		StudentBeanClass p1 = new StudentBeanClass();
		p1.setName("bhavani");
		p1.setId(101);
		p1.setMarks(70);
		StudentBeanClass p4 = new StudentBeanClass();
		p4.setName("sahana");
		p4.setId(104);
		p4.setMarks(70);
		StudentBeanClass p2 = new StudentBeanClass();
		p2.setName("anjali");
		p2.setId(102);
		p2.setMarks(80);
		StudentBeanClass p3 = new StudentBeanClass();
		p3.setName("sahana");
		p3.setId(103);
		p3.setMarks(60);

		a.add(p1);
		a.add(p2);
		a.add(p3);
		for (StudentBeanClass p : a) {
			log.info("name=" + p.getName() + " ID=" + p.getId() + " marks=" + p.getMarks());
		}

	}
}
