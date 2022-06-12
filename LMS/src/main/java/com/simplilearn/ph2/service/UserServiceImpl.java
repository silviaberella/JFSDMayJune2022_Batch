package com.simplilearn.ph2.service;

//import required packages
import com.simplilearn.ph2.dao.UserDaoImpl;
import com.simplilearn.ph2.dto.User;

public class UserServiceImpl implements UserService {

	@Override
	public boolean validateUser(User user) {
		//call method of related dao object for validating user data
		return new UserDaoImpl().validateUser(user);
	}
}
