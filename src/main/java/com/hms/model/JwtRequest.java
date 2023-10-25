package com.hms.model;

public class JwtRequest {

	private String password;

	private String phoneNumber;

//	private String userId;

	public String getPassword() {
		return password;
	}

	public String getPhoneNumber()
	{
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public JwtRequest() {
	}

//	public String getUserId() {
//		return userId;
//	}
//
//	public void setUserId(String userId) {
//		this.userId = userId;
//	}

	public JwtRequest(String phoneNumber, String password) {
		super();
		this.phoneNumber = phoneNumber;
		this.password = password;
//		this.userId = userId;
	}

	@Override
	public String toString() {
		return "JwtRequest [phoneNumber=" + phoneNumber + ", password=" + password + "]";
	}
}
