package com.covalense.java.methodrefdoublecolon;

public class testAverage {

	public static void main(String[] args) {
		MyStudent m=new MyStudent();
		Average a=m::calculateAvg;
		a.avg(21, 16, 19);
	}
}