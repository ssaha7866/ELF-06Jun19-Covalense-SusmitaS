package com.covalense.java.inheritance;

public class Test10 {

	public static void main(String[] args) {
		Baby b=new Baby();
		Lays l=new Lays();
		Kurkure k=new Kurkure();
		
		b.recive(l);
		
		b.recive(k);
	}

}
