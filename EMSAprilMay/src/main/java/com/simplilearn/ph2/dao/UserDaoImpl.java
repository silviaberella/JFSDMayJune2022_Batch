package com.simplilearn.ph2.dao;

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
		Connection connection = (Connection) new ConnectionManagerImpl().getConnection();
		String sql = "select * from userdetails where user_name='"+user.getUsername()+ "' and password='" + user.getPassword()+ "'";
		try {
			Statement statement = (Statement) connection.createStatement();
			ResultSet resultset = statement.executeQuery(sql);
			if (resultset.next()) {
				isUserValid = true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return isUserValid;
	}

}
