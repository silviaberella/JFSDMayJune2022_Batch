package com.simplilearn.ph2.dto;

public class Student {
	// Declaration of variable for class
	private String studentId;
	private String studentFirstName;
	private String studentLastName;
	
	// Constructor without parameters
	public Student() {
	}
	
	// Constructor with parameters
	public Student(String studentId, String studentFirstName, String studentLastName) {
		this.studentId = studentId;
		this.studentFirstName = studentFirstName;
		this.studentLastName = studentLastName;
	}
	
	//Getters and Setters of this class
	
	public String getStudentId() {
		return studentId;
	}
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	public String getStudentFirstName() {
		return studentFirstName;
	}
	public void setStudentFirstName(String studentFirstName) {
		this.studentFirstName = studentFirstName;
	}
	public String getStudentLastName() {
		return studentLastName;
	}
	public void setStudentLastName(String studentLastName) {
		this.studentLastName = studentLastName;
	}
	
}
