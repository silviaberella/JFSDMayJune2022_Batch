package com.simplilearn.ph2.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashSet;
import java.util.Set;

import com.simplilearn.ph2.dto.TrainingClass;
import com.simplilearn.ph2.util.ConnectionManagerImpl;

public class ClassDaoImpl implements ClassDao{
	private Connection connection;

	public ClassDaoImpl() {
		connection = new ConnectionManagerImpl().getConnection();
	}

	@Override
	public boolean addClass(TrainingClass event) {
		boolean isLiveClassAdded = false;
		String query = "insert into live_class values(?,?)";
		
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, event.getLive_class_id());
			preparedStatement.setString(2, event.getLive_class_name());
			int val = preparedStatement.executeUpdate();
			if(val > 0)
				isLiveClassAdded = true;
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
				
		return isLiveClassAdded;
	}

	@Override
	public Set<TrainingClass> getAllClasses() {
		Set<TrainingClass> allClasses = new HashSet<TrainingClass>();
		String query = "select distinct live_class.live_class_id, live_class.live_class_name from live_class";
		try {
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(query);
			while (resultSet.next()){
				TrainingClass event = new TrainingClass(resultSet.getString(1), resultSet.getString(2));
				allClasses.add(event);
				}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
				
		return allClasses;
	}
	
	
	@Override
	public Set<TrainingClass> getClassReport() {
		Set<TrainingClass> allClasses = new HashSet<TrainingClass>();
		String query = "select distinct live_class.live_class_id, live_class.live_class_name, subjectofliveclass.subject_id, subject.subject_name, teacherforliveclass.teacher_id, teacher.first_name, teacher.last_name, studenttoliveclass.student_id, student.first_name, student.last_name from live_class, subjectofliveclass, teacherforliveclass, studenttoliveclass, student, subject, teacher where live_class.live_class_id=subjectofliveclass.live_class_id and live_class.live_class_id=teacherforliveclass.live_class_id and live_class.live_class_id=studenttoliveclass.live_class_id and subjectofliveclass.subject_id = subject.subject_id and teacherforliveclass.teacher_id = teacher.teacher_id and studenttoliveclass.student_id = student.student_id";
		try {
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(query);
			while (resultSet.next()){
				TrainingClass event = new TrainingClass(resultSet.getString(1), resultSet.getString(2), resultSet.getString(3), resultSet.getString(4), resultSet.getString(5), resultSet.getString(6), resultSet.getString(7), resultSet.getString(8), resultSet.getString(9), resultSet.getString(10));
				allClasses.add(event);
				}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
				
		return allClasses;
	}
	
	public boolean assignTeacherForClass(TrainingClass trainingEvent, String teacherId) {
		
		boolean isTeacherForClassAssigned = false;
		return isTeacherForClassAssigned;
	}
	
}
