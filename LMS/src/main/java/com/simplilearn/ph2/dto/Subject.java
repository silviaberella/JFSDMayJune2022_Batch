package com.simplilearn.ph2.dto;

public class Subject {
	
	//Declaration of variable for class
	private String subjectId;
	private String subjectName;
	
	// Constructor without parameters
	public Subject() {
	}
	
	// Constructor with parameters
	public Subject(String subjectId, String subjectName) {
		this.subjectId = subjectId;
		this.subjectName = subjectName;
	}
	
	//Getters and Setters of this class
	
	public String getSubjectId() {
		return subjectId;
	}
	public void setSubjectId(String subjectId) {
		this.subjectId = subjectId;
	}
	public String getSubjectName() {
		return subjectName;
	}
	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}
}
