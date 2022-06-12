package com.simplilearn.ph2.dao;

//import required packages
import java.util.Set;

import com.simplilearn.ph2.dto.Student;

public interface StudentDao {
	public boolean addStudent(Student student);
	Set<Student> getAllStudents();
}
