package com.simplilearn.ph2.service;

//import required packages
import java.util.Set;
import com.simplilearn.ph2.dto.Teacher;

public interface TeacherService {
	boolean addTeacher(Teacher teacher);
	Set<Teacher> getAllTeacher();
}
