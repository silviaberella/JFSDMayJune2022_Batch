package com.simplilearn.ph2.service;

import com.simplilearn.ph2.dao.UserDaoImpl;
import com.simplilearn.ph2.dto.User;

public class UserServiceImpl implements UserService {

	@Override
	public boolean validateUser(User user) {
		return new UserDaoImpl().validateUser(user);
	}
}
