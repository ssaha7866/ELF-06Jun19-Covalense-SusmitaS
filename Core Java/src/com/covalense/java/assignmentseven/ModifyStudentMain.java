package com.covalense.java.assignmentseven;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import lombok.extern.java.Log;
@Log

/*
 * modify student name by attaching mr. or mis based on gender
 */

public class ModifyStudentMain {

	public static void main(String[] args) {
		//creating the student object
		Student student1 = new Student("ram",01, 21,80,'m');
		Student student2 = new Student("faruk",02, 20, 62,'m');
		Student student3 = new Student("nilesh",03, 22, 20,'m');
		Student student4 = new Student("Susmitha",04, 25, 29,'f');
		
		
		ArrayList<Student> studentsList=new ArrayList<>();
		studentsList.add(student1);
		studentsList.add(student2);
		studentsList.add(student3);
		studentsList.add(student4);
		
		Function<Student, Student> modifyName=f->{
			
			if(f.gender=='m')
			{
				f.name="Mr."+f.name;
				return f;
						
			}
			else
			{
				f.name="Mis."+f.name;
				return f;
						
			}	
		};
		//modifying the students by gender 
		List<Student> ls=studentsList.stream().map(modifyName).collect(Collectors.toList());
		
       //printing the student after modify student  name 
		
		ls.forEach(i->log.info("Name is " + i.name+"\nage is "
		                 + i.age+"\nMark is " + i.marks));

	}//main end

}//class end

