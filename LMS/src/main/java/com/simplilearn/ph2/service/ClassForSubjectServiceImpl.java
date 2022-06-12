package com.simplilearn.ph2.service;

import java.util.Set;

import com.simplilearn.ph2.dao.ClassForSubjectDao;
import com.simplilearn.ph2.dao.ClassForSubjectDaoImpl;
import com.simplilearn.ph2.dto.ClassForSubject;

public class ClassForSubjectServiceImpl implements ClassForSubjectService {
	private ClassForSubjectDao classForSubjectDao;

	
	public ClassForSubjectServiceImpl() {
		classForSubjectDao = new ClassForSubjectDaoImpl();
	}
	
	public boolean addClassForSubject(ClassForSubject classForSubject) {
		boolean isClassForSubjectAdded = classForSubjectDao.addClassForSubject(classForSubject);
		return isClassForSubjectAdded;
	};
	
	public Set<ClassForSubject> getAllClassesForSubjects(){
		return classForSubjectDao.getAllClassForSubjects();
	};
}
