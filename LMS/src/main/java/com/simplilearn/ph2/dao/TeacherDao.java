package com.simplilearn.ph2.dao;

//import required packages
import java.util.Set;

import com.simplilearn.ph2.dto.Teacher;

public interface TeacherDao {
	public boolean addTeacher(Teacher teacher);
	Set<Teacher> getAllTeacher();
}
