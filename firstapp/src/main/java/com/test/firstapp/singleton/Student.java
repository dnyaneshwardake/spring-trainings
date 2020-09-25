package com.test.firstapp.singleton;

public class Student {
	private int id;
	private String name;

	private Student() {
	}

	public static Student getInstance() {
		System.out.println("creating singleton instance with static method");
		return new Student();
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