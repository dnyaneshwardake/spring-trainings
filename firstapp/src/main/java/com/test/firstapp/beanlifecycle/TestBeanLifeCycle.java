package com.test.firstapp.beanlifecycle;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBeanLifeCycle {
	public static void main(String[] args) {
//		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:beanlifecycle.xml");
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("classpath:beanlifecycle.xml");

		// PersonXml bean = (PersonXml) context.getBean("person");
		//PersonProgramatic person1 = (PersonProgramatic) context.getBean("person1");
		//System.out.println(person1); 
		context.close();
	}

}
