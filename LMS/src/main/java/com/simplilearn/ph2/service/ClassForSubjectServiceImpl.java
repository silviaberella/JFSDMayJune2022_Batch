package com.simplilearn.ph2.service;

//import required packages
import java.util.Set;

import com.simplilearn.ph2.dao.ClassForSubjectDao;
import com.simplilearn.ph2.dao.ClassForSubjectDaoImpl;
import com.simplilearn.ph2.dto.ClassForSubject;

public class ClassForSubjectServiceImpl implements ClassForSubjectService {
	private ClassForSubjectDao classForSubjectDao;

	
	public ClassForSubjectServiceImpl() {
		
		//Create related Dao object whenever this class will be instantiated
		classForSubjectDao = new ClassForSubjectDaoImpl();
	}
	
	public boolean addClassForSubject(ClassForSubject classForSubject) {
		//call method of related dao object for adding data which has been created in constructor above
		boolean isClassForSubjectAdded = classForSubjectDao.addClassForSubject(classForSubject);
		return isClassForSubjectAdded;
	};
	
	public Set<ClassForSubject> getAllClassesForSubjects(){
		return classForSubjectDao.getAllClassForSubjects();
	};
}
