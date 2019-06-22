package com.covalense.java.exceptions;

import java.io.IOException;

import lombok.extern.java.Log;

@Log
public class Animal1 {
	int a = 10;
	int b;

	void show() throws IOException{
		log.info(""+a / b);
	}

}


@Log
class Cat {
	Animal1 a1=new Animal1();
	void show()
	{
		
		try {
			a1.show();
		}
		catch (NullPointerException e) {
			log.info(""+"Exception is handled NullPointerException catch block inside Cat class");
			}
		catch (ArithmeticException e) {
			log.info(""+"Exception is handled ArithmeticException catch block inside Cat class");
		}
		
		catch (IOException e) {
			log.info(""+"Exception is handled IOException catch block inside Cat class");
		}
		catch (Exception e) {
			log.info(""+"Exception is handled Exception catch block inside Cat class");
			}
	}
}