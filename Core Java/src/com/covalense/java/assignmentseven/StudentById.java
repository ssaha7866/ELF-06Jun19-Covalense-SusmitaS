package com.covalense.java.assignmentseven;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import lombok.extern.java.Log;

@Log
/*
 * sorting the student by id
 * 
 */

public class StudentById {

	public static void main(String[] args) {

		Student student1 = new Student("ram", 2, 21, 80, 'm');
		Student student2 = new Student("faruk", 1, 20, 62, 'm');
		Student student3 = new Student("nilesh", 3, 22, 20, 'm');
		Student student4 = new Student("Susmitha", 04, 25, 29, 'f');

		ArrayList<Student> studentArrayList = new ArrayList<>();
		studentArrayList.add(student1);
		studentArrayList.add(student2);
		studentArrayList.add(student3);
		studentArrayList.add(student4);
		
		
		// filtering the students by id
		Comparator<Student> studentComparator = (e, f) -> {

			if (e.id > f.id) {
				return 1;

			} else if (e.id < f.id) {
				return -1;

			} else {
				return 0;
			}
		};

		List<Student> studentList = studentArrayList.stream()
				.sorted(studentComparator).collect(Collectors.toList());

		// printing the sorted arraylist student by id

		studentList.forEach(i -> log.info("Id is " + i.id +"\nName is " + i.name +
				       "\nage is " + i.age + "\nMark is " + i.marks));

	}// main end

}// class end
