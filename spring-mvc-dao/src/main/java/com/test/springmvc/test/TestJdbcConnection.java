package com.test.springmvc.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Date;

public class TestJdbcConnection {

	public static void main(String[] args) {
		Connection con = null;
		Date start = new Date();
		try {
			for (int i = 0; i < 1000; i++) {
				
				Class.forName("com.mysql.jdbc.Driver");
				con = DriverManager.getConnection("jdbc:mysql://localhost/testdb", "root", "root");
				System.out.println("COn no "+ i);
				con.close();
				
			}
			System.out.println(start +" - "+ new Date());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
