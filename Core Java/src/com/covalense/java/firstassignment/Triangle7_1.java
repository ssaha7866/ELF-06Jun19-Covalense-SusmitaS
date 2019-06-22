package com.covalense.java.firstassignment;

public class Triangle7_1 {

	public static void main(String[] args) {
		int n=5;
		
		//FIRST HALF
		for (int i = 0; i < n-1; i++) {
			int k = 1;
			for (int j = 0; j < n; j++) {
				if (k < n - i) {
					System.out.print(" ");
					k++;
				} else if(i+j==(n-1) || j==n-1)
					System.out.print("*");
				else 
					System.out.print(" ");
			}
			System.out.println();
		}
		
		//SECOND HALF
		
		int space=-1;
		for(int i=n;i>=1;i--)
		{
			space=n-i;
			for(int j=0;j<n;j++)
			{
				if(space>0)
				{
					System.out.print(" ");
					space--;
					
				}else if(i+j==n || j==n-1)
					System.out.print("*");
				else
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}
		