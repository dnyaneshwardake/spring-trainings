package com.test.firstapp.onlyannotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class OnlyAnnotationsTest {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
		Student bean = (Student) context.getBean("student");
		System.out.println(bean);
		// Student bean1 = (Student) context.getBean("student");
	}

}
