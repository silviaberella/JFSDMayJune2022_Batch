package com.simplilearn.ph2.service;

//import required packages
import java.util.Set;

import com.simplilearn.ph2.dao.SubjectDao;
import com.simplilearn.ph2.dao.SubjectDaoImpl;
import com.simplilearn.ph2.dto.Subject;

public class SubjectServiceImpl implements SubjectService {
	private SubjectDao subjectDao;

	public SubjectServiceImpl() {
		//Create related Dao object whenever this class will be instantiated
		subjectDao = new SubjectDaoImpl();
	}

	@Override
	public boolean addSubject(Subject subject) {
		//call method of related dao object for adding data which has been created in constructor above
		boolean isSubjectadded = subjectDao.addSubject(subject);
		return isSubjectadded ;
	}
	
	@Override
	public Set<Subject> getAllSubjects() {
		return subjectDao.getAllSubjects();
	}	
}
