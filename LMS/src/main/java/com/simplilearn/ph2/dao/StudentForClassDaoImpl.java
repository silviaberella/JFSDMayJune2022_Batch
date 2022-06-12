package com.simplilearn.ph2.dao;

//import required packages
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Set;

import com.simplilearn.ph2.dto.StudentToClass;
import com.simplilearn.ph2.util.ConnectionManagerImpl;

public class StudentForClassDaoImpl implements StudentForClassDao {
	private Connection connection;

	public StudentForClassDaoImpl() {
		
		//Establish connection to database
		connection = new ConnectionManagerImpl().getConnection();
	}
	
	public boolean addStudentToClass(StudentToClass studentToClass) {
		boolean isStudentToClassAdded = false;
		
		//Define query for inserting data into database
		String query = "insert into studenttoliveclass values(?,?)";
		
		try {
			//Using prepared statement for injecting query parameter 
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, studentToClass.getClassId());
			preparedStatement.setString(2, studentToClass.getStudentId());
			int val = preparedStatement.executeUpdate();
			if(val > 0)
				//Addition of above data by executing above query has been successful
				isStudentToClassAdded = true;
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		// It will be returned if addition of above data has been successful
		return isStudentToClassAdded;
		
		}

}
