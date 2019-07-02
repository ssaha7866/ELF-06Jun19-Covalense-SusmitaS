package com.covalense.java.assignmentseven;

import java.util.Comparator;
import java.util.TreeSet;

import lombok.extern.java.Log;

@Log
/*
 * sorting the student object by name,
 *  using lambda with comparator
 */
public class TestStudent {
	public static void main(String[] args) {

		// creating the student object
		Student student1 = new Student("ram", 02, 21, 80, 'm');
		Student student2 = new Student("faruk", 01, 20, 62, 'm');
		Student student3 = new Student("nilesh", 03, 22, 20, 'm');
		Student student4 = new Student("Susmitha", 04, 25, 29, 'f');


		// sorting the students by name
		Comparator<Student> c2 = (e, f) -> e.name.compareTo(f.name);

		TreeSet<Student> studentList = new TreeSet<>(c2);
		studentList.add(student1);
		studentList.add(student2);
		studentList.add(student3);
		studentList.add(student4);
		
		// printing the sorted data
		for (Student p : studentList) {

			log.info("Name is " + p.name);
			log.info("age is " + p.age);
			log.info("Mark is " + p.marks);
			log.info("*******");

		} // for end

	}// main end

}// class end
