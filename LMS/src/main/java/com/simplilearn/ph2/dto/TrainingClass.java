package com.simplilearn.ph2.dto;

public class TrainingClass {
	
	//Declaration of variable for class
	private String classId;
	private String className;
	private String subjectId;
	private String subjectName;
	private String teacherId;
	private String teacherFirstName;
	private String teacherLastName;
	private String studentId;
	private String studentFirstName;
	private String studentLastName;
	
	private String live_class_id;
	private String live_class_name;
	
	// Constructor without parameters
	public TrainingClass() {
	}
	
	// Constructor with parameters
	public TrainingClass(String classId, String className, String subjectId, String subjectName, String teacherId, String teacherFirstName,
			String teacherLastName, String studentId, String studentFirstName, String studentLastName) {

		this.classId = classId;
		this.className = className;
		this.subjectId = subjectId;
		this.subjectName = subjectName;
		this.teacherId = teacherId;
		this.teacherFirstName = teacherFirstName;
		this.teacherLastName = teacherLastName;
		this.studentId = studentId;
		this.studentFirstName = studentFirstName;
		this.studentLastName = studentLastName;
	}

	public TrainingClass(String live_class_id, String live_class_name) {
		this.live_class_id = live_class_id;
		this.live_class_name = live_class_name;
	}

	
	//Getters and Setters of this class
	
	public String getClassId() {
		return classId;
	}

	public String getClassName() {
		return className;
	}
	
	public void setClassId(String classId) {
		this.classId = classId;
	}
	
	public void setClassName(String className) {
		this.className = className;
	}

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

	public String getLive_class_id() {
		return live_class_id;
	}

	public void setLive_class_id(String live_class_id) {
		this.live_class_id = live_class_id;
	}

	public String getLive_class_name() {
		return live_class_name;
	}

	public void setLive_class_name(String live_class_name) {
		this.live_class_name = live_class_name;
	}
}
