package com.simplilearn.ph2.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashSet;
import java.util.Set;

import com.simplilearn.ph2.dto.Student;
import com.simplilearn.ph2.util.ConnectionManagerImpl;

public class StudentDaoImpl implements StudentDao{
	private Connection connection;

	public StudentDaoImpl() {
		connection = new ConnectionManagerImpl().getConnection();
	}

	@Override
	public boolean addStudent(Student student) {
		boolean isStudentAdded = false;
		String query = "insert into student values(?,?,?)";
		
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, student.getStudentId());
			preparedStatement.setString(2, student.getStudentFirstName());
			preparedStatement.setString(3, student.getStudentLastName());
			int val = preparedStatement.executeUpdate();
			if(val > 0)
				isStudentAdded = true;
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
				
		return isStudentAdded;
	}

	@Override
	public Set<Student> getAllStudents() {
		Set<Student> allStudents = new HashSet<Student>();
		String query = "select distinct student_id, first_name, last_name from student";
		try {
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(query);
			while (resultSet.next()){
				Student student = new Student(resultSet.getString(1), resultSet.getString(2), resultSet.getString(3));
				allStudents.add(student);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return allStudents;
	}

}
