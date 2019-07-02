package com.covalense.java.assignmentfive;

import java.util.TreeSet;
import java.util.logging.Logger;

/**
 * WAP to sort the employee based on id or name or salary.
 *If the input is 1, employee should be sorted based on name
 *If the input is 2, employee should be sorted based on id
 *If the input is 3, employee should be sorted based on salary
 */
public class EmployeeSorting {

private static final Logger log=Logger.getLogger("bhavani");
	
	public static void main(String[] args) {
			
			EmpById r=new EmpById();
			EmpBySal s=new EmpBySal();
			EmpByName n=new EmpByName();
			int key=1;		
			TreeSetPro6 p=new TreeSetPro6();

			TreeSet<Pro6Emp> t;
			switch (key) {
			case 1:
				 t=new TreeSet<Pro6Emp>(n);
			p.test(t);
				 break;
			case 2:
				t=new TreeSet<Pro6Emp>(r);
				p.test(t);

				break;
			case 3:
				t=new TreeSet<Pro6Emp>(s);
				p.test(t);

				break;
				
			default:
				log.info("invalid number");
				break;
			}

			
		}

	}

