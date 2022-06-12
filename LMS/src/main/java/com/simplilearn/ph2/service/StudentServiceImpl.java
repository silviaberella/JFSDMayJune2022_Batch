package com.simplilearn.ph2.service;

import java.util.Set;

import com.simplilearn.ph2.dao.StudentDao;
import com.simplilearn.ph2.dao.StudentDaoImpl;
import com.simplilearn.ph2.dto.Student;

public class StudentServiceImpl implements StudentService{
	private StudentDao studentDao;
	
	public StudentServiceImpl() {
		studentDao = new StudentDaoImpl();
	}

	@Override
	public boolean addStudent(Student student) {
		boolean isStudentAdded = studentDao.addStudent(student);
		return isStudentAdded;
	}
	
	
	@Override
	public Set<Student> getAllStudents() {
		return studentDao.getAllStudents();
	}
}
