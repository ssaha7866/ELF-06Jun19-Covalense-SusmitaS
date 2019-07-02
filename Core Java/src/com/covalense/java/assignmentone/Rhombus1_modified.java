package com.covalense.java.assignmentone;


public class Rhombus1_modified {

	public static void main(String[] args) {
		int n=9;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++)
			{
				if(i+j==n/2 || j-i==n/2 || i-j==n/2 ||i+j==(n+n/2)-1)
	System.out.print("*");
	else
		System.out.print(" ");
			}
			System.out.println();
		}
	}

}
