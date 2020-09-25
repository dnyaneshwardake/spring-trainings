package com.test.firstapp;

import java.util.List;

public class JavaCollection {
	private List nameList;
	private List countryMap;

	public JavaCollection() {
	}

	public JavaCollection(List nameList, List countryMap) {
		super();
		this.nameList = nameList;
		this.countryMap = countryMap;
	}

	public List getNameList() {
		return nameList;
	}

	public void setNameList(List nameList) {
		this.nameList = nameList;
	}

	public List getCountryMap() {
		return countryMap;
	}

	public void setCountryMap(List countryMap) {
		this.countryMap = countryMap;
	}

	@Override
	public String toString() {
		return "JavaCollection [nameList=" + nameList + ", countryMap=" + countryMap + "]";
	}

}
