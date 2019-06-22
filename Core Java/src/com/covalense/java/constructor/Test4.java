package com.covalense.java.constructor;
import lombok.extern.java.Log;

@Log
class A {
	A()
	{
		log.info(""+"I AM A() CONSTRUCTOR");
	}
	A(int i){
		log.info(""+"A in constructor");
	}
}

@Log
class B extends A
{
	B()
	{
		this(5);
		
		log.info(""+"I AM B() CONSTRUCTOR");
	}
	B(int i)
	{
		log.info(""+"B in CONSTRUCTOR");
	}
}


public class Test4
{
	public static void main(String[] args) {
		new B();
		//k.m();
		
	}
}

