package com.covalense.java.enums;

import lombok.extern.java.Log;
@Log
public class LoanTest {
	
	public static void main(String[] args) {
		
		Loan t1=Loan.HOME;
		int constValue1=t1.getValue();
		log.info("value of home loan "+constValue1);
		
		Loan t2=Loan.PERSONAL;
		int constValue2=t2.getValue();
		log.info("value of personal loan "+constValue2);
		
		Loan t3=Loan.CAR;
		int constValue3=t3.getValue();
		log.info("value of car loan "+constValue3);
	}

}
