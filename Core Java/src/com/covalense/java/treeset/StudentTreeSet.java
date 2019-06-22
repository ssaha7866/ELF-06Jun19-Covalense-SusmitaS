package com.covalense.java.treeset;

import java.util.TreeSet;

import lombok.extern.java.Log;

@Log
public class StudentTreeSet {

	public static void main(String[] args) {
		TreeSet<Student> s=new TreeSet<Student>();
		Student s1=new Student();
		s1.name="Divya";
		s1.percentage=78.98;
		s1.id=1;
		
		Student s2=new Student();
		s2.name="Mittal";
		s2.percentage=98.9;
		s2.id=2;
		
		Student s3=new Student();
		s3.name="Saloni";
		s3.percentage=58.08;
		s3.id=3;
		
		Student s4=new Student();
		s4.name="Harish";
		s4.percentage=87.19;
		s4.id=4;
		
		s.add(s1);
		s.add(s2);
		s.add(s3);
		s.add(s4);
		
		log.info(""+"**************FOR EACH LOOP******************");
		for(Student sd:s) {
		log.info(""+"Name is "+sd.name);
		log.info(""+"Id is "+sd.id);
		log.info(""+"Percentage is "+sd.percentage);
		}
	}

}
