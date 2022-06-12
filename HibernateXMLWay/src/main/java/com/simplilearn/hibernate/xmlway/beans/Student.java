package com.simplilearn.hibernate.xmlway.beans;

public class Student {
private int rollNo;
private String firstName;
private String lastName;
private String grade;

public Student() {
}

public Student(String firstName, String lastName, String grade) {
	this.firstName = firstName;
	this.lastName = lastName;
	this.grade = grade;
}

public int getRollNo() {
	return rollNo;
}
public void setRollNo(int rollNo) {
	this.rollNo = rollNo;
}
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public String getGrade() {
	return grade;
}
public void setGrade(String grade) {
	this.grade = grade;
}


}

