package com.simplilearn.ph2.service;

import java.util.Set;

import com.simplilearn.ph2.dto.ClassForSubject;

public interface ClassForSubjectService {
	boolean addClassForSubject(ClassForSubject classForSubject);
	Set<ClassForSubject> getAllClassesForSubjects();
}
