package com.test.springmvc.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import org.springframework.stereotype.Service;

@Service
public class StudentService {

	public void addStudent(String name, String rollno) throws Exception {

		Class.forName("com.mysql.jdbc.Driver");

		String query = "INSERT INTO student " + "VALUES ('" + name + "','" + rollno + "')";
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost/testdb", "root", "root");
		Statement st = con.createStatement();
		int executeUpdate = st.executeUpdate(query);
		System.out.println(executeUpdate);

	}

}
