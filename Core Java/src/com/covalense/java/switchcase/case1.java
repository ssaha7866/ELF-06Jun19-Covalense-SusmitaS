package com.covalense.java.switchcase;

import lombok.extern.java.Log;

@Log
public class case1 {
	public static void main(String[] args) {
		double percentage=59;
		if(percentage>=60)
		{
			log.info(""+"A");
		}
		else if(percentage>=50 )
			{
				log.info(""+"B");
			}
		else if(percentage>=40 )
		{
			log.info(""+"C");
		}
		else
		{
			log.info(""+"Fail");
		}
		          
	}
}
