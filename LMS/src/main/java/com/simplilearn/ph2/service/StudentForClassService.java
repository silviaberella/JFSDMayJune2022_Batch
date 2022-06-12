package com.simplilearn.ph2.service;

//import required packages
import java.util.Set;

import com.simplilearn.ph2.dto.StudentToClass;

public interface StudentForClassService {
	boolean addStudentToClass(StudentToClass studentToClass);
	Set<StudentToClass> getAllStudentForClasses();
}
