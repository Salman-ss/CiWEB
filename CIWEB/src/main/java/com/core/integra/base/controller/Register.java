package com.core.integra.base.controller;


public class Register {

	private String name;
	private String email;
	private String city;
	private String pass;
	public Register() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Register(String name, String email, String city, String pass) {
		super();
		this.name = name;
		this.email = email;
		this.city = city;
		this.pass = pass;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	@Override
	public String toString() {
		return "Register [name=" + name + ", email=" + email + ", city=" + city + ", pass=" + pass + "]";
	}
	
	
	
	
}
