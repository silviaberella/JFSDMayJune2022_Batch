package com.simplilearn.ph2.dao;

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
		connection = new ConnectionManagerImpl().getConnection();
	}

	@Override
	public boolean addSubject(Subject subject) {
		boolean isSubjectAdded = false;
		String query = "insert into subject values(?,?)";
		
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, subject.getSubjectId());
			preparedStatement.setString(2, subject.getSubjectName());
			int val = preparedStatement.executeUpdate();
			if(val > 0)
				isSubjectAdded = true;
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
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
