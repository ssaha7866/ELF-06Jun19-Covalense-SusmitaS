package com.covalense.java.firstassignment;

public class Triangle5 {

	public static void main(String[] args) {
		int n=5;int space=-1;
		for(int i=n;i>=1;i--)
		{
			space=n-i;
			for(int j=0;j<n;j++)
			{
				if(space>0)
				{
					System.out.print(" ");
					space--;
					
				}else
					System.out.print("*");
			}
			System.out.println();
		}
	}

}
