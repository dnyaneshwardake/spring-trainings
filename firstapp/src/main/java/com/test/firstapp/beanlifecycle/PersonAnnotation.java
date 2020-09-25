package com.test.firstapp.beanlifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class PersonAnnotation {
	private String name;

	public PersonAnnotation() {
	}

	@PostConstruct
	public void init() throws Exception {
		System.out.println("PersonAnnotation: Bean instatiated, inside init");
	}

	@PreDestroy
	public void destroy() throws Exception {
		System.out.println("PersonAnnotation: Container is closing, bean destroied..");
	}

	@Override
	public String toString() {
		return "PersonXml [name=" + name + "]";
	}

	public PersonAnnotation(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
