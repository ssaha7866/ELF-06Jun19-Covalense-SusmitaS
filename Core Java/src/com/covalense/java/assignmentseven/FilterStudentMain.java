package com.covalense.java.assignmentseven;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import lombok.extern.java.Log;
@Log
/*
 * filtering the student only who have ,
 * scored less than 35%  
 */
public class FilterStudentMain {
	public static void main(String[] args) {
		
		Student student1 = new Student("ram", 02, 21, 80, 'm');
		Student student2 = new Student("faruk", 01, 20, 62, 'm');
		Student student3 = new Student("nilesh", 03, 22, 20, 'm');
		Student student4 = new Student("Susmitha", 04, 25, 29, 'f');

		
		
		ArrayList<Student> studentArrayList=new ArrayList<>();
		studentArrayList.add(student1);
		studentArrayList.add(student2);
		studentArrayList.add(student3);
		studentArrayList.add(student4);
		//filtering the students by marks 
		List<Student> studentList=studentArrayList.stream().filter(i->i.marks<=35).collect(Collectors.toList());
		
       //printing the student only who have  scored less than 35%  
		
		studentList.forEach(i->log.info("Name is " + i.name+"\nage is "
		+ i.age+"\nMark is " + i.marks));

	}//main end

}//class end

