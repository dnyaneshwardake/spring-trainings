package com.test.firstapp.methodreplacer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MethodReplacerTest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:methodReplacerTest.xml");
		Bank bean = (Bank) context.getBean("bank");
		bean.calculateInt();
	}

}
