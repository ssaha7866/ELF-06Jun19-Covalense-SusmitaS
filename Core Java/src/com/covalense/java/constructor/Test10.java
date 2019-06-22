package com.covalense.java.constructor;


public class Test10 {

	public static void main(String[] args) {
		Browser b=new Browser();
		Gmail m=new Gmail();
		Gdrive d=new Gdrive();
		b.open(m);
		b.open(d);
	}

}
