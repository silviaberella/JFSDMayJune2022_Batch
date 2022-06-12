package com.simplilearn.ph2.dto;

public class User {
	
	//Declaration of variable for class
	private String username;
	private String password;
	
	// Constructor without parameters
	public User() {
	}

	// Constructor with parameters
	public User(String username, String password) {
		this.username = username;
		this.password = password;
	}


	//Getters and Setters of this class
	
	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}

}
