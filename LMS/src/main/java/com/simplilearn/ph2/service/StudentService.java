package com.simplilearn.ph2.service;

//import required packages
import java.util.Set;

import com.simplilearn.ph2.dto.Student;

public interface StudentService {
	boolean addStudent(Student student);
	Set<Student> getAllStudents();
}
