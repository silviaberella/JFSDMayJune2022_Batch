package com.simplilearn.ph2.dto;

public class TeacherToClass {
	
	//Declaration of variable for class
	private String classId;
	private String teacherId;
	
	// Constructor without parameters
	public TeacherToClass() {

	}
	
	// Constructor with parameters
	public TeacherToClass(String classId, String teacherId) {
		this.classId = classId;
		this.teacherId = teacherId;
	}
	
	//Getters and Setters of this class
	
	public String getClassId() {
		return classId;
	}
	public void setClassId(String classId) {
		this.classId = classId;
	}
	public String getTeacherId() {
		return teacherId;
	}
	public void setTeacherId(String teacherId) {
		this.teacherId = teacherId;
	}
}
