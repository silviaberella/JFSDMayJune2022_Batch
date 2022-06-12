package com.simplilearn.ph2.dao;

//import required packages
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Set;

import com.simplilearn.ph2.dto.ClassForSubject;
import com.simplilearn.ph2.util.ConnectionManagerImpl;

public class ClassForSubjectDaoImpl implements ClassForSubjectDao {
	private Connection connection;
	
	public ClassForSubjectDaoImpl() {
		//Establish connection to database
		connection = new ConnectionManagerImpl().getConnection();
	}

	public boolean addClassForSubject(ClassForSubject classForSubject) {
		boolean isClassForSubjectAdded = false;
		
		//Define query for inserting data into database
		String query = "insert into subjectofliveclass values(?,?)";
		
		try {
			//Using prepared statement for injecting query parameter 
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, classForSubject.getClassId());
			preparedStatement.setString(2, classForSubject.getSubjectId());
			int val = preparedStatement.executeUpdate();
			if(val > 0)
				//Addition of above data by executing above query has been successful
				isClassForSubjectAdded = true;
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		// It will be returned if addition of above data has been successful
		return isClassForSubjectAdded;
	};
	
	public Set<ClassForSubject> getAllClassForSubjects(){
		return null;
	};
	
}
