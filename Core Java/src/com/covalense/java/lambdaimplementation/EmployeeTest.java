package com.covalense.java.lambdaimplementation;

import java.util.Comparator;
import java.util.TreeSet;

import lombok.extern.java.Log;
@Log
public class EmployeeTest {

	public static void main(String[] args) {
		
		Employee e1=new Employee("Anitha",1, 12000);
		Employee e2=new Employee("Anitha",2, 20000);
		Employee e3=new Employee("Anitha",3, 15000);
		Employee e4=new Employee("Anitha",4, 32000);
		Employee e5=new Employee("Anitha",5, 62000);
		
		//SIMPLE WAY
		/*Comparator<Employee>c1=(e,f)->{
			if (e1.id > e2.id) {
				return 1;
			} else if (e1.id < e2.id) {
				return -1;
			} else { 
				return 0;
			}
		};*/
		//USING LAMBDA EXPRESSION
		Comparator<Employee>c2=(e,f)->e.name.compareTo(f.name);
		
		
		
		
		TreeSet<Employee> ts=new TreeSet<Employee>(c2);
		ts.add(e1);
		ts.add(e2);
		ts.add(e3);
		ts.add(e4);
		ts.add(e5);
		
		for(Employee e: ts) {
			log.info(""+e);
		}
	}

}
