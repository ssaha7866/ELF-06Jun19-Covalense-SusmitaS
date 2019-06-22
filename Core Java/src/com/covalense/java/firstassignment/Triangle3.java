package com.covalense.java.firstassignment;

public class Triangle3 {

	public static void main(String[] args) {
		int n=8;
		for(int i=0;i<2*n;i++)
		{
			if(i<n)
			{
				for(int j=0;j<=i;j++)
				{
					System.out.print("* ");
				}
			}
			else
			{
				for(int j=2*n-2-i;j>=0;j--)
				{
					System.out.print("+ ");
				}
			}
			System.out.println();
		}
	}

}
