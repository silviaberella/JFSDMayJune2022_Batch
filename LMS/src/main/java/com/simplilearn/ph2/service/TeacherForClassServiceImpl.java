package com.simplilearn.ph2.service;

import java.util.Set;
import com.simplilearn.ph2.dao.TeacherForClassDao;
import com.simplilearn.ph2.dao.TeacherForClassDaoImpl;
import com.simplilearn.ph2.dto.TeacherToClass;

public class TeacherForClassServiceImpl implements TeacherForClassService{
	private TeacherForClassDao teacherForClassDao;

	public TeacherForClassServiceImpl() {
		teacherForClassDao = new TeacherForClassDaoImpl();
	}

	public boolean addTeacherToClass(TeacherToClass teacherToClass){
		boolean isTeacherForClassAdded = teacherForClassDao.addTeacherToClass(teacherToClass);
		return isTeacherForClassAdded;
	};
	
	public Set<TeacherToClass> getAllTeacherForClasses(){
		return null;
	};
}
