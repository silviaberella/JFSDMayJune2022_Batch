package com.simplilearn.ph2.dao;

import java.util.Set;

import com.simplilearn.ph2.dto.StudentToClass;

public interface StudentForClassDao {
	boolean addStudentToClass(StudentToClass studentToClass);
	public Set<StudentToClass> getAllStudentForClasses();
}
