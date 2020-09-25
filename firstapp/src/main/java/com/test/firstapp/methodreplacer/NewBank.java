package com.test.firstapp.methodreplacer;

import java.lang.reflect.Method;

import org.springframework.beans.factory.support.MethodReplacer;

public class NewBank implements MethodReplacer {

	public Object reimplement(Object arg0, Method arg1, Object[] arg2) throws Throwable {
		System.out.println("calculating int. with new rate 10%");
		return null;
	}
}
