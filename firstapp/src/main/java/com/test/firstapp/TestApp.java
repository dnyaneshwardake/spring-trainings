package com.test.firstapp;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class TestApp {

	public static void main(String[] args) {

		// ApplicationContext context = new
		// ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		// Student bean = (Student) context.getBean("std");
		// Student bean1 = (Student) context.getBean("student");

		// Address address = (Address) context.getBean("address");
		// System.out.println(address);

		// System.out.println(bean);

		// Lazy loading of
		Resource resource = new ClassPathResource("applicationContext.xml");
		BeanFactory factory = new XmlBeanFactory(resource);

		// Address address1 = (Address) factory.getBean("std");
		// System.out.println(address1);

		Student st = (Student) factory.getBean("stdnt");
		System.out.println(st);
		// Student st1 = (Student) factory.getBean("std");
	}

}
