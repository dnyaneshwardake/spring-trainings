package com.test.firstapp;

import org.springframework.stereotype.Component;

@Component
public class Student {
	private int id;
	private String name;

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name;
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
