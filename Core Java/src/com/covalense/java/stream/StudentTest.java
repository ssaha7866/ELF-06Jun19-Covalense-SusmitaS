package com.covalense.java.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Optional;

import lombok.extern.java.Log;

@Log
public class StudentTest {
	
	static Comparator<Student> c=(i,j)->{
		if(i.getPercentage()>(j.getPercentage())){
				return 1;
		}else if(i.getPercentage()<(j.getPercentage())){
				return -1;
		}else {
			return 0;
		}
	};
	
	static Student getTopper(ArrayList<Student>al) {
		
		return al.stream().max(c).get();
	}
static Student getPapper(ArrayList<Student>al) {
		
		return al.stream().min(c).get();
	}

	
	public static void main(String[] args) {
		Student s1=new Student("Anjali", 6, 99.90);
		Student s2=new Student("Anjaan", 40, 40.76);
		Student s3=new Student("Mithali", 8, 70.80);
		Student s4=new Student("Tingra", 2, 82.0);
		Student s5=new Student("Dumpy", 5, 95.0);
	
		ArrayList<Student> al=new ArrayList<Student>();
		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);
		al.add(s5);
		
		
		Student sT=getTopper(al);
		Student sP=getPapper(al);
		log.info(""+sT.getName()+" has scored the highest percentage "+sT.getPercentage());
		log.info(""+sP.getName()+" has scored the lowest percentage "+sP.getPercentage());
		
	}
	
	

}
