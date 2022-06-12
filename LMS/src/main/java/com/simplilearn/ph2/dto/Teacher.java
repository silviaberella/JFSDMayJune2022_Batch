package com.simplilearn.ph2.dto;

public class Teacher {
	
	//Declaration of variable for class
	private String teacherId;
	private String teacherFirstName;
	private String teacherLastName;
	
	// Constructor without parameters
	public Teacher() {
	}
	
	// Constructor with parameters
	public Teacher(String teacherId, String teacherFirstName, String teacherLastName) {
		this.teacherId = teacherId;
		this.teacherFirstName = teacherFirstName;
		this.teacherLastName = teacherLastName;
	}
	
	
	//Getters and Setters of this class
	
	
	public String getTeacherId() {
		return teacherId;
	}
	public void setTeacherId(String teacherId) {
		this.teacherId = teacherId;
	}
	
	public String getTeacherFirstName() {
		return teacherFirstName;
	}
	public void setTeacherFirstName(String teacherFirstName) {
		this.teacherFirstName = teacherFirstName;
	}
	public String getTeacherLastName() {
		return teacherLastName;
	}
	public void setTeacherLastName(String teacherLastName) {
		this.teacherLastName = teacherLastName;
	}
}
