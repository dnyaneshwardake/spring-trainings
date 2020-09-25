package com.test.firstapp.autowire;

public class Address {
	private String city;
	private String country;
	private Address() {
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	private Address(String city, String country) {
		this.city = city;
		this.country = country;
		System.out.println("Address cons called - para 2");
	}
	
	private Address(String city) {
		this.city = city;
		System.out.println("Address cons called - para 1");
	}

	@Override
	public String toString() {
		return "Address [city=" + city + ", country=" + country + "]";
	}
	
	

}

