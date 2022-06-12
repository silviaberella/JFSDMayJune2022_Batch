package com.simplilearn.ph2.dao;

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
		connection = new ConnectionManagerImpl().getConnection();
	}

	@Override
		public boolean addTeacher(Teacher teacher) {
		boolean isTeacherAdded = false;
		String query = "insert into teacher values(?,?,?)";
		
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, teacher.getTeacherId());
			preparedStatement.setString(2, teacher.getTeacherFirstName());
			preparedStatement.setString(3, teacher.getTeacherLastName());
			int val = preparedStatement.executeUpdate();
			if(val > 0)
				isTeacherAdded = true;
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
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
