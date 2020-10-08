package com.test.firstapp;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class NewTest {

	public static void main(String[] args) {

		
		 // Student s = new Student(); Student s1 = new Student(10, "Sam");
		  //System.out.println(s1);
		 

		
		
		
		
		
		
		
		
		
		
		
		
		
		 ApplicationContext context = new ClassPathXmlApplicationContext("classpath:test.xml");
		Student bean1 = (Student) context.getBean("student");
		 System.out.println(bean1);
		// Address address = (Address) context.getBean("address");
		// System.out.println(address);

		// System.out.println(bean);

		// Lazy loading of
//		Resource resource = new ClassPathResource("applicationContext.xml");
//		BeanFactory factory = new XmlBeanFactory(resource);
//
//		// Address address1 = (Address) factory.getBean("std");
//		// System.out.println(address1);
//
//		Student st = (Student) factory.getBean("stdnt");
//		System.out.println(st);
		// Student st1 = (Student) factory.getBean("std");
	}

}
