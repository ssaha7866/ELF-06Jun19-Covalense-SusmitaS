package com.covalense.java.lambdaimplementation;

import java.util.Comparator;

import com.covalense.java.treeset.Employee;

public class EmployeeById implements Comparator<Employee> {

	@Override
	public int compare(Employee e1, Employee e2) {
		if (e1.id > e2.id) {
			return 1;
		} else if (e1.id < e2.id) {
			return -1;
		} else { 
			return 0;
		}
	}
}
