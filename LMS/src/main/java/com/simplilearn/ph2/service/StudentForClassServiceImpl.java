package com.simplilearn.ph2.service;

//import required packages
import java.util.Set;
import com.simplilearn.ph2.dao.StudentForClassDao;
import com.simplilearn.ph2.dao.StudentForClassDaoImpl;
import com.simplilearn.ph2.dto.StudentToClass;

public class StudentForClassServiceImpl implements StudentForClassService {
	private StudentForClassDao studentForClassDao;
	
	public StudentForClassServiceImpl() {
		//Create related Dao object whenever this class will be instantiated
		studentForClassDao = new StudentForClassDaoImpl();
	}

	@Override
	public boolean addStudentToClass(StudentToClass studentToClass) {
		//call method of related dao object for adding data which has been created in constructor above
		boolean isStudentForClassAdded = studentForClassDao.addStudentToClass(studentToClass);
		return isStudentForClassAdded;
	}

	@Override
	public Set<StudentToClass> getAllStudentForClasses() {
		return null;
	}

}
