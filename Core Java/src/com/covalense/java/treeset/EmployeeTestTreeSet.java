package com.covalense.java.treeset;

import java.util.TreeSet;

import lombok.extern.java.Log;

@Log
public class EmployeeTestTreeSet {

	public static void main(String[] args) {
		//EmployeeById ei=new EmployeeById();
		//EmployeeBysalary es =new EmployeeBysalary();
		EmployeeByName en=new EmployeeByName();
		TreeSet<Employee> et = new TreeSet<Employee>(en);
		
		Employee e1 = new Employee();
		e1.name = "Divya";
		e1.salary = 78000;
		e1.id = 1;

		Employee e2 = new Employee();
		e2.name = "Ramu";
		e2.salary = 8000;
		e2.id = 2;

		Employee e3 = new Employee();
		e3.name = "Saloni";
		e3.salary = 78000;
		e3.id = 3;

		Employee e4 = new Employee();
		e4.name = "Anita";
		e4.salary = 10000;
		e4.id = 4;

		et.add(e1);
		et.add(e2);
		et.add(e3);
		et.add(e4);

		log.info(""+"**************FOR EACH LOOP******************");
		for (Employee e : et) {
			log.info(""+"Name is " + e.name);
			log.info(""+"Id is " + e.id);
			log.info(""+"Percentage is " + e.salary);
		}
	}

}
