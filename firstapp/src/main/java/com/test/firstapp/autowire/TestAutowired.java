package com.test.firstapp.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.test.firstapp.JavaCollection;

public class TestAutowired {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:autowiredAnnoTest.xml");
		Student bean = (Student) context.getBean("student");
		System.out.println(bean);
	}
}
