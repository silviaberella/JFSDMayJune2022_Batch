package com.simplilearn.ph2.service;

//import required packages
import java.util.Set;
import com.simplilearn.ph2.dao.TeacherForClassDao;
import com.simplilearn.ph2.dao.TeacherForClassDaoImpl;
import com.simplilearn.ph2.dto.TeacherToClass;

public class TeacherForClassServiceImpl implements TeacherForClassService{
	private TeacherForClassDao teacherForClassDao;

	public TeacherForClassServiceImpl() {
		//Create related Dao object whenever this class will be instantiated
		teacherForClassDao = new TeacherForClassDaoImpl();
	}

	public boolean addTeacherToClass(TeacherToClass teacherToClass){
		//call method of related dao object for adding data which has been created in constructor above
		boolean isTeacherForClassAdded = teacherForClassDao.addTeacherToClass(teacherToClass);
		return isTeacherForClassAdded;
	};
	
	public Set<TeacherToClass> getAllTeacherForClasses(){
		return null;
	};
}
