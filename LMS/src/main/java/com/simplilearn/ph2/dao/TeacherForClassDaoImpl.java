package com.simplilearn.ph2.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Set;

import com.simplilearn.ph2.dto.TeacherToClass;
import com.simplilearn.ph2.util.ConnectionManagerImpl;

public class TeacherForClassDaoImpl implements TeacherForClassDao {
	private Connection connection;
		
	public TeacherForClassDaoImpl() {
		connection = new ConnectionManagerImpl().getConnection();
	}

		public boolean addTeacherToClass(TeacherToClass teacherToClass) {
		boolean isTeacherForClassAdded = false;
		String query = "insert into teacherforliveclass values(?,?)";
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, teacherToClass.getClassId());
			preparedStatement.setString(2, teacherToClass.getTeacherId());
			int val = preparedStatement.executeUpdate();
			if(val > 0)
				isTeacherForClassAdded = true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return isTeacherForClassAdded;
		}
	
	public Set<TeacherToClass> getAllTeacherForClasses(){
		return null;
	};
}
