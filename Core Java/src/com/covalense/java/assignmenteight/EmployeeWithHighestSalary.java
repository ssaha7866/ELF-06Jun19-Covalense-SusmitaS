package com.covalense.java.assignmenteight;

import java.util.ArrayList;
import java.util.Comparator;

import lombok.extern.java.Log;

@Log
/**
 * 
 * Printing employee with highest and lowest salary
 *
 */
public class EmployeeWithHighestSalary {

	static Comparator<Employee> c = (i, j) -> {
		if (i.getSalary() > j.getSalary()) {
			return 1;
		} else if (i.getSalary() < j.getSalary()) {
			return -1;
		} else {
			return 0;
		}
	};

	static Employee getHighSal(ArrayList<Employee> al) {

		return al.stream().max(c).get();
	}

	static Employee getLowSal(ArrayList<Employee> al) {

		return al.stream().min(c).get();
	}

	public static void main(String[] args) {

		Employee e1 = new Employee("Priya", 25, 25000);
		Employee e2 = new Employee("Sunil", 26, 87000);
		Employee e3 = new Employee("Anita", 23, 67000);
		Employee e4 = new Employee("Vikas", 29, 75000);
		Employee e5 = new Employee("Robin", 22, 55000);

		ArrayList<Employee> ae = new ArrayList<>();
		ae.add(e1);
		ae.add(e2);
		ae.add(e3);
		ae.add(e4);
		ae.add(e5);

		Employee sT = getHighSal(ae);
		log.info("" + sT.getName() + " has the highest salary " + sT.getSalary());

		Employee sL = getLowSal(ae);
		log.info("" + sL.getName() + " has the highest salary " + sL.getSalary());
	}

}
