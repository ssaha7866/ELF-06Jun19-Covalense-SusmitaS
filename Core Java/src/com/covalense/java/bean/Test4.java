package com.covalense.java.bean;

public class Test4 {

	public static void main(String[] args) {
		Person1 a = new Person1();
		a.setAge(28);
		a.setName("Gandu");
		DB1 d1 = new DB1();
		DB2 d2 = new DB2();
		d1.recieve(a);
		d2.recieve(a);

	}

}
