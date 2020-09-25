package com.test.firstapp;

import java.lang.reflect.Constructor;

public class ReflectionTest {

	public static void main(String[] args) {

		try {
			Class c = Class.forName("com.test.firstapp.Address");
			Constructor[] cons = c.getDeclaredConstructors();
			cons[0].setAccessible(true);

			Address adress = (Address) cons[0].newInstance();

			System.out.println(adress);

		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
