package com.test.springmvc.beans;

public class Student {

	private Integer id;
	private String name;
	private String rollno;
	private String city;

	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(Integer id, String name, String rollno, String city) {
		super();
		this.id = id;
		this.name = name;
		this.rollno = rollno;
		this.city = city;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", rollno=" + rollno + ", city=" + city + "]";
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRollno() {
		return rollno;
	}

	public void setRollno(String rollno) {
		this.rollno = rollno;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

}
