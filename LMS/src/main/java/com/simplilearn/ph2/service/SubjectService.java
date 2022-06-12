package com.simplilearn.ph2.service;

import java.util.Set;

import com.simplilearn.ph2.dto.Subject;

public interface SubjectService {
	boolean addSubject(Subject subject);
	Set<Subject> getAllSubjects();
}
