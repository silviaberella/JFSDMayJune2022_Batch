package com.simplilearn.ph2.dao;

//import required packages
import java.util.Set;

import com.simplilearn.ph2.dto.ClassForSubject;
import com.simplilearn.ph2.dto.Subject;

public interface ClassForSubjectDao {
	public boolean addClassForSubject(ClassForSubject classForSubject);
	Set<ClassForSubject> getAllClassForSubjects();
}
