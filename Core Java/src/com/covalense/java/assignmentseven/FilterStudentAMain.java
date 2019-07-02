package com.covalense.java.assignmentseven;
import java.util.ArrayList;

import java.util.List;
import java.util.stream.Collectors;

import lombok.extern.java.Log;
	@Log
	/*
	 * filtering the student only who have ,
	 * scored more than 75%  
	 */
	public class FilterStudentAMain {
		public static void main(String[] args) {
			
			Student student1 = new Student("ram", 02, 21, 80, 'm');
			Student student2 = new Student("faruk", 01, 20, 62, 'm');
			Student student3 = new Student("nilesh", 03, 22, 20, 'm');
			Student student4 = new Student("Susmitha", 04, 25, 29, 'f');

						
			ArrayList<Student> a=new ArrayList<>();
			a.add( student1 );
			a.add(student2);
			a.add(student3);
			a.add(student4);
			//filtering the students by marks >75
			List<Student> ls=a.stream().filter(i->i.marks>=75).collect(Collectors.toList());
			
	       //printing the student only who have  scored less than 35%  
			
			ls.forEach(i->log.info("Name is " + i.name+"\nage is "
			+ i.age+"\nMark is " + i.marks));

		}//main end

	}//class end
