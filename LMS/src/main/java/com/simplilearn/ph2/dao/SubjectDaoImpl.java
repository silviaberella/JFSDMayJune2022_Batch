package com.simplilearn.ph2.dao;

//import required packages
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashSet;
import java.util.Set;

import com.simplilearn.ph2.dto.Subject;
import com.simplilearn.ph2.dto.Teacher;
import com.simplilearn.ph2.util.ConnectionManagerImpl;

public class SubjectDaoImpl implements SubjectDao{
	private Connection connection;

	public SubjectDaoImpl() {
		
		//Establish connection to database
		connection = new ConnectionManagerImpl().getConnection();
	}

	@Override
	public boolean addSubject(Subject subject) {
		boolean isSubjectAdded = false;
		
		//Define query for inserting data into database
		String query = "insert into subject values(?,?)";
		
		try {
			//Using prepared statement for injecting query parameter 
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, subject.getSubjectId());
			preparedStatement.setString(2, subject.getSubjectName());
			int val = preparedStatement.executeUpdate();
			if(val > 0)
				//Addition of above data by executing above query has been successful
				isSubjectAdded = true;
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		// It will be returned if addition of above data has been successful
		return isSubjectAdded;
	}

	@Override
	public Set<Subject> getAllSubjects() {
		Set<Subject> allSubjects = new HashSet<Subject>();
		String query = "select distinct subject_id, subject_name from subject";
		try {
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(query);
			while (resultSet.next()){
				Subject subject = new Subject(resultSet.getString(1), resultSet.getString(2));
				allSubjects.add(subject);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return allSubjects;
	}
}
