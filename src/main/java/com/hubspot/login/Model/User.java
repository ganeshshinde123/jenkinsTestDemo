package com.hubspot.login.Model;

public class User {
	private int uId;
	private String email;
	private String password;
	
	
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(int uId, String email, String password) {
		super();
		this.uId = uId;
		this.email = email;
		this.password = password;
	}
	
	public int getuId() {
		return uId;
	}
	public void setuId(int uId) {
		this.uId = uId;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "User [uId=" + uId + ", email=" + email + ", password=" + password + "]";
	}
	
	
}
