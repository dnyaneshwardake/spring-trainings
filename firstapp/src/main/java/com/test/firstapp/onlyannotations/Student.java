package com.test.firstapp.onlyannotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Student {
	private int id;
	private String name;
	@Autowired
	@Qualifier(value = "address1")
	private Address address;

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", address=" + address + "]";
	}

	public Student(int id, String name) {
		this.id = id;
		this.name = name;
		System.out.println("Student Cons called - para 2");
	}

	public Student() {
		System.out.println("Defalt cons called..");
	}

	public Student(int id) {
		super();
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
