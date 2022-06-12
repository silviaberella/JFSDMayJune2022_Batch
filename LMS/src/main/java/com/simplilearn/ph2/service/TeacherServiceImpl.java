package com.simplilearn.ph2.service;

//import required packages
import java.util.Set;
import com.simplilearn.ph2.dao.TeacherDao;
import com.simplilearn.ph2.dao.TeacherDaoImpl;
import com.simplilearn.ph2.dto.Teacher;

public class TeacherServiceImpl implements TeacherService{
	private TeacherDao teacherDao;
	
	public TeacherServiceImpl() {
		//Create related Dao object whenever this class will be instantiated
		teacherDao = new TeacherDaoImpl();
	}

	@Override
	public boolean addTeacher(Teacher teacher) {
		//call method of related dao object for adding data which has been created in constructor above
		boolean isTeachadded = teacherDao.addTeacher(teacher);
		return isTeachadded ;
	}
	
	@Override
	public Set<Teacher> getAllTeacher() {
		return teacherDao.getAllTeacher();
	}
}
