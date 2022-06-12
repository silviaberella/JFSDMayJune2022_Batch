package com.simplilearn.ph2.service;

import java.util.Set;

import com.simplilearn.ph2.dao.ClassDao;
import com.simplilearn.ph2.dao.ClassDaoImpl;
import com.simplilearn.ph2.dto.TrainingClass;

public class ClassServiceImpl implements ClassService {
	private ClassDao classDao;
	
	public ClassServiceImpl() {
		classDao = new ClassDaoImpl();
	}

	@Override
	public boolean addClass(TrainingClass event) {
		boolean isLiveClassAdded = classDao.addClass(event);
		return isLiveClassAdded;
	}

	@Override
	public Set<TrainingClass> getAllClasses() {
		return classDao.getAllClasses();
	}
	
	@Override
	public Set<TrainingClass> getClassReport() {
		return classDao.getClassReport();
	}
	
	public boolean assignTeacherForClass(TrainingClass trainingEvent, String teacherId) {
		boolean isClassAssignedAdded = classDao.assignTeacherForClass(trainingEvent, teacherId);
		return isClassAssignedAdded;
	}
}
