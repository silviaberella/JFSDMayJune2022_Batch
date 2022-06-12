package com.simplilearn.ph2.dto;

public class ClassForSubject {
	
	//Declaration of variable for class
	private String classId;
	private String subjectId;
	
	// Constructor without parameters
	public ClassForSubject() {
	}
	
	// Constructor with parameters
	public ClassForSubject(String classId, String subjectId) {
		this.classId = classId;
		this.subjectId = subjectId;
	}


	//Getters and Setters of this class
	
		public String getClassId() {
		return classId;
	}


	public void setClassId(String classId) {
		this.classId = classId;
	}


	public String getSubjectId() {
		return subjectId;
	}


	public void setSubjectId(String subjectId) {
		this.subjectId = subjectId;
	}
	
}
