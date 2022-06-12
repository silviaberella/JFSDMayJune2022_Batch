package com.simplilearn.ph2.dto;

public class StudentToClass {
	
	//Declaration of variable for class
	private String classId;
	private String studentId;
	
	// Constructor without parameters
	public StudentToClass() {
	}
	// Constructor with parameters
	public StudentToClass(String classId, String studentId) {
		this.classId = classId;
		this.studentId = studentId;
	}

	
	//Getters and Setters of this class
	
	public String getClassId() {
		return classId;
	}

	public void setClassId(String classId) {
		this.classId = classId;
	}

	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
}
