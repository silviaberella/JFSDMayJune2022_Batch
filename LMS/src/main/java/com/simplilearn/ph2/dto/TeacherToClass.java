package com.simplilearn.ph2.dto;

public class TeacherToClass {
	private String classId;
	private String teacherId;
	public TeacherToClass() {

	}
	public TeacherToClass(String classId, String teacherId) {
		this.classId = classId;
		this.teacherId = teacherId;
	}
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
