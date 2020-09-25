package com.test.firstapp.propertiesfileuse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.test.firstapp.methodreplacer.Bank;

public class PropertiesTest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:propertiesUse.xml");
		ConnectionDetails bean = (ConnectionDetails) context.getBean("connectionDetails");
		System.out.println(bean);
	}

}
