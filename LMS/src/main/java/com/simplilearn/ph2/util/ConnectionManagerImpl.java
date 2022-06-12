package com.simplilearn.ph2.util;

//import required packages
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionManagerImpl implements ConnectionManager{

	@Override
	public Connection getConnection() {
		Connection connection = null;
		try {
			// Define connection details to database /driver, user, password)
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/LMS", 
					"root", 
					"root");
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return connection;
	}
}
