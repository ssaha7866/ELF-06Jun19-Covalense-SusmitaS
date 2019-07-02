package com.covalense.java.assignmentseven;

import java.util.ArrayList;

import lombok.extern.java.Log;

@Log
/*
 * displaying  the Employees by using forEach()
 * 
 */
public class EmployeesDisplayingUsingForEach {
	
	
	public static void main(String[] args) {


		Employee employee1=new Employee("robin", 220000,01, "software engineer", 4);

		Employee employee2=new Employee("nilesh", 100000,02,"admin",6);

		Employee employee3=new Employee("bibin", 250000,06,"software engineer",1);

		Employee employee4=new Employee("kalbesh", 20000,04,"software engineer",4);

		ArrayList<Employee> employeeArrayList = new ArrayList<>();
		employeeArrayList.add(employee1);
		employeeArrayList.add(employee2);
		employeeArrayList.add(employee3);
		employeeArrayList.add(employee4);
		

		// printing the  arrayList student by forEach()

		employeeArrayList.forEach(i -> log.info("Id is " + i.id +"\nName is " + i.name +
				       "\nSalary is " + i.salary+"\n job is "+i.job+"\nExperience is "+i.experience));

	}// main end

}// class end


