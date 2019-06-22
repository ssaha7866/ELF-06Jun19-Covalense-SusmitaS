package com.covalense.java.objectclass;

import lombok.extern.java.Log;

@Log
public class Test {

	public static void main(String[] args) {
		Student s=new Student("Dimpi", 20, 5.30);
		Student p=new Student("Dimpi", 20, 5.30);
		
		log.info(""+s.equals(p));
		log.info(""+s.hashCode());
		log.info(""+p.hashCode());
	}

}
