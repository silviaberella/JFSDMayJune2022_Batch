package com.simplilearn.ph2.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Set;

import com.simplilearn.ph2.dto.StudentToClass;
import com.simplilearn.ph2.util.ConnectionManagerImpl;

public class StudentForClassDaoImpl implements StudentForClassDao {
	private Connection connection;

	public StudentForClassDaoImpl() {
		connection = new ConnectionManagerImpl().getConnection();
	}
	
	public boolean addStudentToClass(StudentToClass studentToClass) {
		boolean isStudentToClassAdded = false;
		String query = "insert into studenttoliveclass values(?,?)";
		
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, studentToClass.getClassId());
			preparedStatement.setString(2, studentToClass.getStudentId());
			int val = preparedStatement.executeUpdate();
			if(val > 0)
				isStudentToClassAdded = true;
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return isStudentToClassAdded;
		
		}
	public Set<StudentToClass> getAllStudentForClasses(){
		return null;
	};
}
