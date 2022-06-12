package com.simplilearn.ph2.dao;

//import required packages
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Set;

import com.simplilearn.ph2.dto.TeacherToClass;
import com.simplilearn.ph2.util.ConnectionManagerImpl;

public class TeacherForClassDaoImpl implements TeacherForClassDao {
	private Connection connection;
		
	public TeacherForClassDaoImpl() {
		
		//Establish connection to database
		connection = new ConnectionManagerImpl().getConnection();
	}

		public boolean addTeacherToClass(TeacherToClass teacherToClass) {
		boolean isTeacherForClassAdded = false;
		
		//Define query for inserting data into database
		String query = "insert into teacherforliveclass values(?,?)";
		try {
			//Using prepared statement for injecting query parameter 
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, teacherToClass.getClassId());
			preparedStatement.setString(2, teacherToClass.getTeacherId());
			int val = preparedStatement.executeUpdate();
			if(val > 0)
				//Addition of above data by executing above query has been successful
				isTeacherForClassAdded = true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		// It will be returned if addition of above data has been successful
		return isTeacherForClassAdded;
		}
	
	public Set<TeacherToClass> getAllTeacherForClasses(){
		return null;
	};
}
