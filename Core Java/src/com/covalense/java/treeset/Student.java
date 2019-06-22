package com.covalense.java.treeset;

public class Student implements Comparable <Student>{
	String name;
	int id;
	double percentage;
	
	
	/* LOGIC TO SORT STUDENT WRT PERCENTAGE
	@Override
	public int compareTo(Student s) {
		if(this.percentage<s.percentage) {
			return -1;
		}
		else if(this.percentage>s.percentage) {
			return 1;
		}
		else {
			return 0;
		}
	}*/
	
	/* LOGIC TO SORT STUDENT WRT TO ID
	 @Override
	public int compareTo(Student s) {
		if(this.id<s.id) {
			return -1;
		}
		else if(this.id>s.id) {
			return 1;
		}
		else {
			return 0;
		}
		or
		
		Integer k=this.id;
		Integer p=s.id;
		return k.compareTo(p);
		*/
	
	@Override
	public int compareTo(Student s) {
		return this.name.compareTo(s.name) ;
			
	}

}
