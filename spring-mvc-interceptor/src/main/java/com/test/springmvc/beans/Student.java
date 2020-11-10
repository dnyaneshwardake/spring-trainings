package com.test.springmvc.beans;

import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Student {

	@NotNull
	private Integer id;
	@NotEmpty
	@Size(max = 30, min = 5)
	@Pattern(regexp = "[^0-9]*")
	private String name;
	@NotNull(message = "Roll no must not be empty")
	@Min(value = 1)
	private Integer rollno;
	@Email
	@NotNull(message = "Email must not be empty")
	private String email;

	private String hobby; // Cricket, Football, Swimming

	public Student() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", rollno=" + rollno + ", email=" + email + ", hobby=" + hobby
				+ "]";
	}

	public Student(Integer id, String name, Integer rollno, String email, String hobby) {
		super();
		this.id = id;
		this.name = name;
		this.rollno = rollno;
		this.email = email;
		this.hobby = hobby;
	}

	public String getHobby() {
		return hobby;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
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

	public Integer getRollno() {
		return rollno;
	}

	public void setRollno(Integer rollno) {
		this.rollno = rollno;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
