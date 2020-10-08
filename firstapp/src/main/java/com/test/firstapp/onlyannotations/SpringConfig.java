package com.test.firstapp.onlyannotations;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan(basePackages = "com.test.firstapp.onlyannotations")
public class SpringConfig {
	@Bean(name = "student", autowire = Autowire.BY_TYPE, initMethod = "", destroyMethod = "")
	@Scope(value = "singleton")
	public Student getStudent() {
		return new Student(11, "Sam");
	}

	@Bean(name = "address1")
	@Scope(value = "singleton")
	public Address getAddress() {
		return new Address("City", "Country");
	}

	@Bean(name = "address2")
	@Scope(value = "singleton")
	public Address getAddress2() {
		return new Address("test", "abc");
	}
}
