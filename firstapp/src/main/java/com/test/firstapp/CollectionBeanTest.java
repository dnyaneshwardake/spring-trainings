package com.test.firstapp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CollectionBeanTest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:collection.xml");
		JavaCollection bean = (JavaCollection) context.getBean("collection");
		System.out.println(bean);
	}

}
