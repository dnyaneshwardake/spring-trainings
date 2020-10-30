package com.test.springmvc.config;

import javax.sql.DataSource;

import org.apache.tomcat.dbcp.dbcp2.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

@Configuration
@ComponentScan(basePackages = "com.test")
public class Config {

	@Bean
	public DataSource getDataSource() {
		DataSource ds = getBasicDataSource();
		return ds;
	}

	public BasicDataSource getBasicDataSource() {
		BasicDataSource bds = new BasicDataSource();
		bds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		bds.setUrl("jdbc:mysql://localhost/test");
		bds.setUsername("root");
		bds.setPassword("root");
		bds.setMaxIdle(1000 * 10);
		bds.setMaxWaitMillis(1000 * 10);
		bds.setMaxTotal(15);
		return bds;
	}

	@Bean
	public JdbcTemplate getTemplate() {
		DataSource ds = getBasicDataSource();
		JdbcTemplate jt = new JdbcTemplate(ds);
		return jt;
	}
}
