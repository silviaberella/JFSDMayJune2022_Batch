package com.simplilearn.ph2.dao;

import java.util.Set;

import com.simplilearn.ph2.dto.TeacherToClass;

public interface TeacherForClassDao {
	boolean addTeacherToClass(TeacherToClass teacherToClass);
	public Set<TeacherToClass> getAllTeacherForClasses();
	
}
