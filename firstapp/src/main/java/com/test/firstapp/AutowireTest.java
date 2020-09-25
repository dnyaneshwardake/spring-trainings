package com.test.firstapp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutowireTest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:autowiretest.xml");
		Student bean = (Student) context.getBean("student");
		System.out.println(bean);
	}

}
