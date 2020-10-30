package com.test.springmvc.test;

import java.sql.Connection;
import java.util.Date;

import org.apache.tomcat.dbcp.dbcp2.BasicDataSource;

public class TestBasicDataSource {

	public static void main(String[] args) {

		BasicDataSource bds = new BasicDataSource();
		bds.setDriverClassName("com.mysql.jdbc.Driver");
		bds.setUrl("jdbc:mysql://localhost/testdb");
		bds.setUsername("root");
		bds.setPassword("root");
		bds.setMaxIdle(1000 * 10);
		bds.setMaxWaitMillis(1000 * 10);
		bds.setMaxTotal(15);
		
		Connection con = null;
		Date start = new Date();
		try {
			for (int i = 0; i < 1000; i++) {
				con = bds.getConnection();
				System.out.println("Con no " + i);
				con.close();

			}
			System.out.println(start + " - " + new Date());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
