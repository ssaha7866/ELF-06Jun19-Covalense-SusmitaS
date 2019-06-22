package com.covalense.java.hasarelation;

import lombok.extern.java.Log;

@Log
public class College {
	static Student s=new Student();
	void teach()
	{
		log.info(""+"METHOD OF COLLEGE CLASS");
		                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      
	}

}


@Log
class Student
{
	String name;
	void play()
	{
		log.info(""+"METHOD OF STUDENT CLASS");
	}
}
