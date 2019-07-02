package com.covalense.java.assignmentseven;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import lombok.extern.java.Log;

@Log
/*
 * filtering only employee experience more than 2 years ,
 * and job==software engineer
 * 
 */


public class FilteringEmployee {


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
		
		//filtering the Employee who have experience > 2 years
		List<Employee> employeeList=employeeArrayList.stream().
				filter(i->i.experience>2 && i.job=="software engineer" ).collect(Collectors.toList());
		
		

		// printing the  arrayList student by forEach()

		employeeList.forEach(i -> log.info("Id is " + i.id +"\nName is " + i.name +
				       "\nSalary is " + i.salary+"\n job is "+i.job+"\nExperience is "+i.experience));

	}// main end

}// class end



