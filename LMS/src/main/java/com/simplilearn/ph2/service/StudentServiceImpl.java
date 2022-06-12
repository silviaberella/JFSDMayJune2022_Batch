package com.simplilearn.ph2.service;

//import required packages
import java.util.Set;

import com.simplilearn.ph2.dao.StudentDao;
import com.simplilearn.ph2.dao.StudentDaoImpl;
import com.simplilearn.ph2.dto.Student;

public class StudentServiceImpl implements StudentService{
	private StudentDao studentDao;
	
	public StudentServiceImpl() {
		//Create related Dao object whenever this class will be instantiated
		studentDao = new StudentDaoImpl();
	}

	@Override
	public boolean addStudent(Student student) {
		//call method of related dao object for adding data which has been created in constructor above
		boolean isStudentAdded = studentDao.addStudent(student);
		return isStudentAdded;
	}
	
	
	@Override
	public Set<Student> getAllStudents() {
		return studentDao.getAllStudents();
	}
}
