package com.simplilearn.ph2.dao;

//import required packages
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashSet;
import java.util.Set;

import com.simplilearn.ph2.dto.Teacher;
import com.simplilearn.ph2.util.ConnectionManagerImpl;

public class TeacherDaoImpl implements TeacherDao{
	
	private Connection connection;

	public TeacherDaoImpl() {
		
		//Establish connection to database
		connection = new ConnectionManagerImpl().getConnection();
	}

	@Override
		public boolean addTeacher(Teacher teacher) {
		boolean isTeacherAdded = false;
		
		//Define query for inserting data into database
		String query = "insert into teacher values(?,?,?)";
		
		try {
			//Using prepared statement for injecting query parameter 
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, teacher.getTeacherId());
			preparedStatement.setString(2, teacher.getTeacherFirstName());
			preparedStatement.setString(3, teacher.getTeacherLastName());
			int val = preparedStatement.executeUpdate();
			if(val > 0)
				//Addition of above data by executing above query has been successful
				isTeacherAdded = true;
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		// It will be returned if addition of above data has been successful
		return isTeacherAdded;
	}

	@Override
	public Set<Teacher> getAllTeacher() {
		Set<Teacher> allTeacher = new HashSet<Teacher>();
		String query = "select distinct teacher_id, first_name, last_name from teacher";
		try {
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(query);
			while (resultSet.next()){
				Teacher teacher = new Teacher(resultSet.getString(1), resultSet.getString(2), resultSet.getString(3));
				allTeacher.add(teacher);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return allTeacher;
	}
}
