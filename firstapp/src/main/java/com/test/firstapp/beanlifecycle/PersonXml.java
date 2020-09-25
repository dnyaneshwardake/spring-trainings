package com.test.firstapp.beanlifecycle;

public class PersonXml {
	private String name;

	public PersonXml() {
	}

	public void init() throws Exception {
		System.out.println("PersomXml: Bean instatiated, inside init");
	}

	public void destroy() throws Exception {
		System.out.println("PersonXml: Container is closing, bean destroied..");
	}

	@Override
	public String toString() {
		return "PersonXml [name=" + name + "]";
	}

	public PersonXml(String name) {
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
