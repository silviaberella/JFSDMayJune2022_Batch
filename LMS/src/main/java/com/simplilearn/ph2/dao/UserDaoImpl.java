package com.simplilearn.ph2.dao;

//import required packages
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.simplilearn.ph2.dto.User;
import com.simplilearn.ph2.util.ConnectionManagerImpl;

public class UserDaoImpl implements UserDao{

	@Override
	public boolean validateUser(User user) {
		boolean isUserValid = false;
		
		//Establish connection to database
		Connection connection = (Connection) new ConnectionManagerImpl().getConnection();
		
		//Define query for getting data from database
		String sql = "select * from userdetails where user_name='"+user.getUsername()+ "' and password='" + user.getPassword()+ "'";
		try {
			Statement statement = (Statement) connection.createStatement();
			ResultSet resultset = statement.executeQuery(sql);
			
			//return true if user is available in userdetails table in database, so user is admin
			if (resultset.next()) {
				isUserValid = true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return isUserValid;
	}

}
