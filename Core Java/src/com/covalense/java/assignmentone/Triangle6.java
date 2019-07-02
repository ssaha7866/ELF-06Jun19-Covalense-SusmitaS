package com.covalense.java.assignmentone;

public class Triangle6 {
	public static void main(String[] args) {
		int n = 6;
		
		//first half
		for (int i = 0; i < n; i++) {
			int k = 1;
			for (int j = 0; j < n; j++) {
				if (k < n - i) {
					System.out.print(" ");
					k++;
				} else
					System.out.print("*");
			}
			
			//second half
			for(int j=0;j<i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
