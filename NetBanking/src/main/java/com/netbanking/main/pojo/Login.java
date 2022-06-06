package com.netbanking.main.pojo;

public class Login {
	
	private String userID;
	private String password;
	private String role;
	
	public Login() {
		// TODO Auto-generated constructor stub
	}

	public Login(String userID, String password, String role) {
		super();
		this.userID = userID;
		this.password = password;
		this.role = role;
	}

	public String getUserID() {
		return userID;
	}

	public void setUserID(String userID) {
		this.userID = userID;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "Login [userID=" + userID + ", password=" + password + ", role=" + role + "]";
	}
	
	

}
