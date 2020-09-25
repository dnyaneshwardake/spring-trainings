package com.test.firstapp.beanlifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class PersonProgramatic implements InitializingBean, DisposableBean{
	private String name;

	public PersonProgramatic() {
	}


	@Override
	public String toString() {
		return "PersonXml [name=" + name + "]";
	}

	public PersonProgramatic(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public void destroy() throws Exception {
		System.out.println("PersonPrgramatic: Container is closing Inside destroy");
		
	}

	// Simlilar to init method
	public void afterPropertiesSet() throws Exception {
		System.out.println("PersonPrgramatic: Inside afterproperty set, ban initilized");
		
	}
}
