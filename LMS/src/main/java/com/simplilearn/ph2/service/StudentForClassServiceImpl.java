package com.simplilearn.ph2.service;

import java.util.Set;
import com.simplilearn.ph2.dao.StudentForClassDao;
import com.simplilearn.ph2.dao.StudentForClassDaoImpl;
import com.simplilearn.ph2.dto.StudentToClass;

public class StudentForClassServiceImpl implements StudentForClassService {
	private StudentForClassDao studentForClassDao;
	
	public StudentForClassServiceImpl() {
		studentForClassDao = new StudentForClassDaoImpl();
	}

	@Override
	public boolean addStudentToClass(StudentToClass studentToClass) {
		boolean isStudentForClassAdded = studentForClassDao.addStudentToClass(studentToClass);
		return isStudentForClassAdded;
	}

	@Override
	public Set<StudentToClass> getAllStudentForClasses() {
		return null;
	}

}
