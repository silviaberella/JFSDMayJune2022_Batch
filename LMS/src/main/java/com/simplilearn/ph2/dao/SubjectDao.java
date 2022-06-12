package com.simplilearn.ph2.dao;

//import required packages
import java.util.Set;

import com.simplilearn.ph2.dto.Subject;

public interface SubjectDao {
	public boolean addSubject(Subject subject);
	Set<Subject> getAllSubjects();
}
