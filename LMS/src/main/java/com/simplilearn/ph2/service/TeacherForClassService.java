package com.simplilearn.ph2.service;

//import required packages
import java.util.Set;

import com.simplilearn.ph2.dto.TeacherToClass;

public interface TeacherForClassService {
	boolean addTeacherToClass(TeacherToClass teacherToClass);
	Set<TeacherToClass> getAllTeacherForClasses();
}
