package com.myproject.model;

import java.sql.Timestamp;

public class CustomerVO {

	private String CustomerId;
	private String name;
	private int age;
	private String pw;
	private String email;
	private String address;
	private Timestamp regdate;
	private String phoneNumber;
	
	public CustomerVO() {
		// TODO Auto-generated constructor stub
	}
	public CustomerVO(String customerId, String name, int age, String pw, String email, String address,
			 String phoneNumber) {
		super();
		CustomerId = customerId;
		this.name = name;
		this.age = age;
		this.pw = pw;
		this.email = email;
		this.address = address;
		this.phoneNumber = phoneNumber;
	}
	
	

	public String getCustomerId() {
		return CustomerId;
	}

	public void setCustomerId(String customerId) {
		CustomerId = customerId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Timestamp getRegdate() {
		return regdate;
	}

	public void setRegdate(Timestamp regdate) {
		this.regdate = regdate;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	
}
