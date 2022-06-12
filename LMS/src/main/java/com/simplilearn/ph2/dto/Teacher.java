package com.simplilearn.ph2.dto;

public class Teacher {
	private String teacherId;
	private String teacherFirstName;
	private String teacherLastName;
	public Teacher() {
	}
	
	public Teacher(String teacherId, String teacherFirstName, String teacherLastName) {
		this.teacherId = teacherId;
		this.teacherFirstName = teacherFirstName;
		this.teacherLastName = teacherLastName;
	}
	
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
