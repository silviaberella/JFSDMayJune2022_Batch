package com.simplilearn.ph2.service;

import java.util.Set;
import com.simplilearn.ph2.dao.TeacherDao;
import com.simplilearn.ph2.dao.TeacherDaoImpl;
import com.simplilearn.ph2.dto.Teacher;

public class TeacherServiceImpl implements TeacherService{
	private TeacherDao teacherDao;
	
	public TeacherServiceImpl() {
		teacherDao = new TeacherDaoImpl();
	}

	@Override
	public boolean addTeacher(Teacher teacher) {
		boolean isTeachadded = teacherDao.addTeacher(teacher);
		return isTeachadded ;
	}
	
	@Override
	public Set<Teacher> getAllTeacher() {
		return teacherDao.getAllTeacher();
	}
}
