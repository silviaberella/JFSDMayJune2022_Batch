package com.simplilearn.ph2.service;

import java.util.Set;

import com.simplilearn.ph2.dao.SubjectDao;
import com.simplilearn.ph2.dao.SubjectDaoImpl;
import com.simplilearn.ph2.dto.Subject;

public class SubjectServiceImpl implements SubjectService {
	private SubjectDao subjectDao;

	public SubjectServiceImpl() {
		subjectDao = new SubjectDaoImpl();
	}

	@Override
	public boolean addSubject(Subject subject) {
		boolean isSubjectadded = subjectDao.addSubject(subject);
		return isSubjectadded ;
	}
	
	@Override
	public Set<Subject> getAllSubjects() {
		return subjectDao.getAllSubjects();
	}	
}
