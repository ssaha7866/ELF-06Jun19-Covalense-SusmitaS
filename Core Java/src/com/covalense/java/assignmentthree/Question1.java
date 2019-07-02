package com.covalense.java.assignmentthree;

import lombok.extern.java.Log;

@Log
public class Question1 {

	public static void main(String[] args) {
		
		Student s1=new Student();
				
		s1.setName("Geetha");
		s1.setAge(20);
		s1.setRoll(9);
		
		Student s2=new Student();
		
		s2.setName("Rita");
		s2.setAge(22);
		s2.setRoll(19);
		
		Student s3=new Student();
		
		s3.setName("Sita");
		s3.setAge(25);
		s3.setRoll(6);
		
		Student s4=new Student();
		
		s4.setName("Amithabh");
		s4.setAge(29);
		s4.setRoll(1);
		
		Student s[]=new Student[4];
		s[0]=s1;
		s[1]=s2;
		s[2]=s3;
		s[3]=s4;
		for(int i=0;i<4;i++)
		{
			log.info("Name is "+ s[i].getName() );
			log.info("Age is "+ s[i].getAge() );
			log.info("Roll is "+ s[i].getRoll() );
		}
	}

}
