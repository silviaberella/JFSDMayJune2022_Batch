package com.simplilearn.ph2.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Set;

import com.simplilearn.ph2.dto.ClassForSubject;
import com.simplilearn.ph2.util.ConnectionManagerImpl;

public class ClassForSubjectDaoImpl implements ClassForSubjectDao {
	private Connection connection;
	
	public ClassForSubjectDaoImpl() {
		connection = new ConnectionManagerImpl().getConnection();
	}

	public boolean addClassForSubject(ClassForSubject classForSubject) {
		boolean isClassForSubjectAdded = false;
		String query = "insert into subjectofliveclass values(?,?)";
		
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, classForSubject.getClassId());
			preparedStatement.setString(2, classForSubject.getSubjectId());
			int val = preparedStatement.executeUpdate();
			if(val > 0)
				isClassForSubjectAdded = true;
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return isClassForSubjectAdded;
	};
	
	public Set<ClassForSubject> getAllClassForSubjects(){
		return null;
	};
	
}
