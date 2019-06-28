package com.covalense.java.assessment.mobileobject;

import java.util.ArrayList;

/**
 * 
 * creating mobile objects and setting values to it.
 * calling the method to display the objects
 *
 */
public class MobileTest {
	
	
	
	public static void main(String[] args) {
		
		MobileBean m1=new MobileBean();
		m1.setName("nokia phone");
		m1.setCost(25000);
		
		MobileBean m2=new MobileBean();
		m2.setName("iphone");
		m2.setCost(120000);
		
		MobileBean m3=new MobileBean();
		m3.setName("lenovo phone");
		m3.setCost(20000);
		
		MobileBean m4=new MobileBean();
		m4.setName("asus phone");
		m4.setCost(32000);
		
		ArrayList<MobileBean> al=new ArrayList<MobileBean>();
		al.add(m1);
		al.add(m2);
		al.add(m3);
		al.add(m4);
		
		for(MobileBean mb:al) {
			DisplayMobile.display(mb);
		}
	}

}
