package com.covalense.springcore.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.covalense.springcore.beans.MessageBean;

import lombok.extern.java.Log;
@Log
public class MessageTest {

	public static void main(String[] args) {

		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("Spring.xml");
		MessageBean messageBean=(MessageBean)applicationContext.getBean("messageBean");
		log.warning(messageBean.getMessage());
	}

}
