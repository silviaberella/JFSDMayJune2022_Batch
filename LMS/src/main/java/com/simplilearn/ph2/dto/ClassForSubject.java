package com.simplilearn.ph2.dto;

public class ClassForSubject {
	private String classId;
	private String subjectId;
	
	
	public ClassForSubject() {
	}
	
	
	public ClassForSubject(String classId, String subjectId) {
		this.classId = classId;
		this.subjectId = subjectId;
	}


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
